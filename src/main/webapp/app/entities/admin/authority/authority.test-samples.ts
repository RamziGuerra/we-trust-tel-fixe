import { IAuthority, NewAuthority } from './authority.model';

export const sampleWithRequiredData: IAuthority = {
  name: 'eb084230-8f5f-493c-8a86-2aa1171b33f8',
};

export const sampleWithPartialData: IAuthority = {
  name: '02612e47-0693-41dd-9bc8-ec8e16e3e96b',
};

export const sampleWithFullData: IAuthority = {
  name: '556fd5a4-4dab-45d4-aa46-e3fd2031a93c',
};

export const sampleWithNewData: NewAuthority = {
  name: null,
};

Object.freeze(sampleWithNewData);
Object.freeze(sampleWithRequiredData);
Object.freeze(sampleWithPartialData);
Object.freeze(sampleWithFullData);
