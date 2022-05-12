const mongoose = require("mongoose");

const Schema = mongoose.Schema;

const teamSchema = new Schema({
    name:{
        type: String,
        required: true,
        unique: false
    },
    coach:{
        type: mongoose.Types.ObjectId,
        required: true,
        unique: false
    },
    players:{
        type: [mongoose.Types.ObjectId],
        require: true,
        unique: false
    }
})

const Team = mongoose.model("team", teamSchema);

module.exports = Team;