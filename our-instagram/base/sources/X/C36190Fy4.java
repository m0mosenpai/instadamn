package X;

/* renamed from: X.Fy4, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36190Fy4 implements InterfaceC66482zP {
    public final Integer A00;

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        switch (this.A00.intValue()) {
            case 0:
                return "FEED";
            case 1:
                return "STORY";
            case 2:
                return AbstractC43591JPw.A00(279);
            case 3:
                return "REEL";
            case 4:
                return "LIVE";
            case 5:
                return "AI";
            case 6:
                return "MADE_FOR_YOU";
            case 7:
                return "PROMOTE";
            case 8:
                return "FUNDRAISER";
            case 9:
                return "INVITE_GROUP_MEMBERS";
            case 10:
                return "CHANNEL_CREATION";
            case 11:
                return "QUIET_POSTING";
            default:
                return "MUSIC_HIGHLIGHT";
        }
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        C36190Fy4 c36190Fy4 = (C36190Fy4) obj;
        C14360o3.A0B(c36190Fy4, 0);
        return AbstractC167007dF.A1X(c36190Fy4.A00, this.A00);
    }

    public C36190Fy4(Integer num) {
        this.A00 = num;
    }
}
