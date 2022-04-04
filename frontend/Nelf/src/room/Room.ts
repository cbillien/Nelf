import { User } from "../user/User";

export class Room {
    constructor(
        public id: number,
        public name: string,
        public taille: number,
        public creationDate: Date,
        public releaseDate: Date,
        public user: User
    ) {}
  }
  