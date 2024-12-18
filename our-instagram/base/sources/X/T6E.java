package X;

import com.google.android.gms.internal.mlkit_vision_text_common.zzcz;

/* loaded from: classes10.dex */
public final class T6E implements zzcz {
    public final int A00;
    public final EnumC61072Rem A01;

    public T6E(EnumC61072Rem enumC61072Rem, int i) {
        this.A00 = i;
        this.A01 = enumC61072Rem;
    }

    @Override // java.lang.annotation.Annotation
    public final Class annotationType() {
        return zzcz.class;
    }

    @Override // java.lang.annotation.Annotation
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof zzcz) {
                T6E t6e = (T6E) ((zzcz) obj);
                if (this.A00 != t6e.A00 || !this.A01.equals(t6e.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.lang.annotation.Annotation
    public final int hashCode() {
        return (this.A00 ^ 14552422) + (this.A01.hashCode() ^ 2041407134);
    }

    @Override // java.lang.annotation.Annotation
    public final String toString() {
        StringBuilder A0s = AbstractC58318PtA.A0s("@com.google.firebase.encoders.proto.Protobuf");
        A0s.append("(tag=");
        A0s.append(this.A00);
        A0s.append("intEncoding=");
        return AbstractC167017dG.A0o(this.A01, A0s);
    }
}
