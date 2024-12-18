package X;

import com.google.android.gms.internal.mlkit_vision_common.zzah;

/* loaded from: classes10.dex */
public final class T6A implements zzah {
    public final int A00;
    public final EnumC61071Rel A01;

    public T6A(EnumC61071Rel enumC61071Rel, int i) {
        this.A00 = i;
        this.A01 = enumC61071Rel;
    }

    @Override // java.lang.annotation.Annotation
    public final Class annotationType() {
        return zzah.class;
    }

    @Override // java.lang.annotation.Annotation
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof zzah) {
                T6A t6a = (T6A) ((zzah) obj);
                if (this.A00 != t6a.A00 || !this.A01.equals(t6a.A01)) {
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
