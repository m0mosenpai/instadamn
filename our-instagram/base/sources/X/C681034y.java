package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.34y, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C681034y implements InterfaceC62772tG {
    public final InterfaceC09390do A00;
    public final InterfaceC09390do A01;
    public final /* synthetic */ String A02;

    public C681034y(UserSession userSession, String str) {
        this.A02 = str;
        this.A00 = AbstractC09440dt.A01(new C9EQ(userSession, 15));
        this.A01 = AbstractC09440dt.A01(new C9EQ(userSession, 16));
    }

    @Override // X.InterfaceC62772tG
    public final boolean Axz() {
        Object value = this.A00.getValue();
        C14360o3.A07(value);
        return ((Boolean) value).booleanValue();
    }

    @Override // X.InterfaceC62772tG
    public final C1BZ BMf() {
        String str;
        String str2 = this.A02;
        switch (str2.hashCode()) {
            case -849559289:
                str = "smb_support_sticker_prefs";
                break;
            case -825846745:
                str = AbstractC43591JPw.A00(1349);
                break;
            case -277889517:
                str = "ig_threads_in_stories_unit";
                break;
            case -151634498:
                str = "clips_viewer_ghost";
                break;
            case 239603921:
                str = "merlin_impression";
                break;
            case 1735369040:
                str = "clips_viewer_qp";
                break;
            default:
                return C1BZ.A02;
        }
        if (str2.equals(str)) {
            return C1BZ.A03;
        }
        return C1BZ.A02;
    }

    @Override // X.InterfaceC62772tG
    public final boolean BvU() {
        return ((Boolean) this.A01.getValue()).booleanValue();
    }

    @Override // X.InterfaceC62772tG
    public final String getFileName() {
        return this.A02;
    }
}
