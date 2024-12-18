package X;

/* loaded from: classes11.dex */
public final class W5H {
    public final String A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof W5H) && C14360o3.A0K(this.A00, ((W5H) obj).A00));
    }

    public final String toString() {
        return AnonymousClass001.A0S("GraphQLErrorInfo(additionalInfoFromRESTDoNotUseExceptForMigration=", this.A00, ')');
    }

    public final int hashCode() {
        return AbstractC167017dG.A0O(this.A00);
    }

    public W5H(String str) {
        this.A00 = str;
    }

    public W5H() {
        this(null);
    }
}
