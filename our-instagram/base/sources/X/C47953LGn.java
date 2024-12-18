package X;

/* renamed from: X.LGn, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C47953LGn {
    public String A00;
    public String A01;
    public final Integer A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C47953LGn) {
                C47953LGn c47953LGn = (C47953LGn) obj;
                if (!"".equals("") || !C14360o3.A0K(this.A01, c47953LGn.A01) || !C14360o3.A0K(this.A00, c47953LGn.A00) || this.A02 != c47953LGn.A02) {
                }
            }
            return false;
        }
        return true;
    }

    public final String toString() {
        return AnonymousClass001.A17("ExpressoDataItem(stickerPackId=", "", ", stickerTraySurface=", this.A01, ", stickerPackType=", this.A00, ", surface=", LAM.A01(this.A02), ')');
    }

    public final int hashCode() {
        return AbstractC166997dE.A0K(this.A00, AbstractC166987dD.A0J(this.A01)) + LAM.A00(this.A02);
    }

    public C47953LGn(String str, Integer num, String str2) {
        AbstractC167017dG.A1R(str, str2);
        this.A01 = str;
        this.A00 = str2;
        this.A02 = num;
    }

    public C47953LGn() {
        this("", C05F.A00, "");
    }
}
