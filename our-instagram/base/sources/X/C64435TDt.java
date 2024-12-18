package X;

import com.google.firebase.encoders.proto.Protobuf;

/* renamed from: X.TDt, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64435TDt implements Protobuf {
    public final int A00;
    public final EnumC61088Rf2 A01;

    @Override // java.lang.annotation.Annotation
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Protobuf)) {
            return false;
        }
        C64435TDt c64435TDt = (C64435TDt) ((Protobuf) obj);
        return this.A00 == c64435TDt.A00 && this.A01.equals(c64435TDt.A01);
    }

    @Override // java.lang.annotation.Annotation
    public final Class annotationType() {
        return Protobuf.class;
    }

    @Override // java.lang.annotation.Annotation
    public final int hashCode() {
        return (this.A00 ^ 14552422) + (this.A01.hashCode() ^ 2041407134);
    }

    @Override // java.lang.annotation.Annotation
    public final String toString() {
        StringBuilder A0s = AbstractC58318PtA.A0s("@com.google.firebase.encoders.proto.Protobuf");
        A0s.append('(');
        A0s.append("tag=");
        A0s.append(this.A00);
        A0s.append("intEncoding=");
        return AbstractC167017dG.A0o(this.A01, A0s);
    }

    public C64435TDt(EnumC61088Rf2 enumC61088Rf2, int i) {
        this.A00 = i;
        this.A01 = enumC61088Rf2;
    }
}
