import { User } from "src/user/User";


export class Nft {
    constructor(
      public id: number,
      public tokenAddress: string,
      public tokenId: string,
      public name: string,
      public image: string,
      public user: User
    ) {}
  }
  