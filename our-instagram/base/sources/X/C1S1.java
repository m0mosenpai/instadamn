package X;

/* renamed from: X.1S1, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C1S1 {
    public static final EnumC26881Rz A00(C1QY c1qy) {
        switch (c1qy.A09) {
            case Undefined:
                return EnumC26881Rz.A0D;
            case Video:
                return EnumC26881Rz.A0E;
            case VideoCoverImage:
                return EnumC26881Rz.A0G;
            case Image:
                return EnumC26881Rz.A09;
            case Other:
                return EnumC26881Rz.A0C;
            case API:
                return EnumC26881Rz.A05;
            case CriticalAPI:
                return EnumC26881Rz.A06;
            case MediaUpload:
                return EnumC26881Rz.A0B;
            case Analytics:
                return EnumC26881Rz.A04;
            case VideoCall:
                return EnumC26881Rz.A0F;
            case GraphQL:
                return EnumC26881Rz.A08;
            default:
                throw new RuntimeException();
        }
    }
}
