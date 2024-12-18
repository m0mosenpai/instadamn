package X;

import java.util.Arrays;

/* loaded from: classes10.dex */
public final class RMM extends AbstractC64527TId {
    public final AbstractC64537TIt A00;

    public final int hashCode() {
        return AbstractC37301Gc2.A02(2, this.A00);
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        AbstractC64537TIt abstractC64537TIt;
        AbstractC64537TIt abstractC64537TIt2;
        AbstractC64527TId abstractC64527TId = (AbstractC64527TId) obj;
        int A02 = abstractC64527TId.A02();
        int i = 2;
        if (2 == A02 && (i = (abstractC64537TIt = this.A00).A02()) == (A02 = (abstractC64537TIt2 = ((RMM) abstractC64527TId).A00).A02())) {
            return C62844STr.A00.compare(abstractC64537TIt.A03(), abstractC64537TIt2.A03());
        }
        return i - A02;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.A00.equals(((RMM) obj).A00);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String toString() {
        C63004SaS c63004SaS;
        int i;
        boolean z;
        RMH rmh = (RMH) SK8.A00;
        SK8 sk8 = rmh.A02;
        if (sk8 == null) {
            C63004SaS c63004SaS2 = rmh.A00;
            int i2 = 0;
            while (true) {
                char[] cArr = c63004SaS2.A07;
                int length = cArr.length;
                if (i2 < length) {
                    char c = cArr[i2];
                    if (c >= 'a' && c <= 'z') {
                        int i3 = 0;
                        while (true) {
                            i = 65;
                            if (i3 < length) {
                                char c2 = cArr[i3];
                                if (c2 >= 'A' && c2 <= 'Z') {
                                    z = true;
                                    break;
                                }
                                i3++;
                            } else {
                                z = false;
                                break;
                            }
                        }
                        if (!z) {
                            char[] cArr2 = new char[length];
                            for (int i4 = 0; i4 < length; i4++) {
                                char c3 = cArr[i4];
                                if (c3 >= 97 && c3 <= 122) {
                                    c3 ^= 32;
                                }
                                cArr2[i4] = (char) c3;
                            }
                            c63004SaS = new C63004SaS(c63004SaS2.A04.concat(".upperCase()"), cArr2);
                            if (c63004SaS2.A05 && !c63004SaS.A05) {
                                byte[] bArr = c63004SaS.A06;
                                byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
                                do {
                                    int i5 = i | 32;
                                    byte b = bArr[i];
                                    byte b2 = bArr[i5];
                                    if (b == -1) {
                                        copyOf[i] = b2;
                                    } else {
                                        char c4 = (char) i;
                                        char c5 = (char) i5;
                                        if (b2 == -1) {
                                            copyOf[i5] = b;
                                        } else {
                                            throw AbstractC166987dD.A14(S2W.A00("Can't ignoreCase() since '%s' and '%s' encode different values", Character.valueOf(c4), Character.valueOf(c5)));
                                        }
                                    }
                                    i++;
                                } while (i <= 90);
                                c63004SaS = new C63004SaS(c63004SaS.A04.concat(".ignoreCase()"), copyOf, c63004SaS.A07, true);
                            }
                        } else {
                            throw AbstractC166987dD.A14("Cannot call upperCase() on a mixed-case alphabet");
                        }
                    } else {
                        i2++;
                    }
                } else {
                    c63004SaS = c63004SaS2;
                    break;
                }
            }
            if (c63004SaS == c63004SaS2) {
                sk8 = rmh;
            } else {
                Character ch = rmh.A01;
                if (rmh instanceof RMF) {
                    sk8 = new RMH(c63004SaS, ch);
                    if (c63004SaS.A07.length != 64) {
                        throw AbstractC58318PtA.A0Y();
                    }
                } else if (rmh instanceof RMG) {
                    sk8 = new RMG(c63004SaS);
                } else {
                    sk8 = new RMH(c63004SaS, ch);
                }
            }
            rmh.A02 = sk8;
        }
        return AnonymousClass001.A0g("h'", AbstractC58322PtE.A0p(sk8, this.A00), "'");
    }

    public RMM(AbstractC64537TIt abstractC64537TIt) {
        this.A00 = abstractC64537TIt;
    }
}
