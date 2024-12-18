package X;

import android.os.Bundle;
import com.instagram.common.session.UserSession;

/* loaded from: classes11.dex */
public final class V7U extends KDD {
    public static final String __redex_internal_original_name = "StickerExistingThreadSheetFragment";
    public KZH A00;
    public InterfaceC37172GZj A01;
    public boolean A02;
    public final InterfaceC09390do A03 = AbstractC60492pY.A02(this);
    public final boolean A04 = true;

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "sticker_existing_thread_sheet_fragment";
    }

    @Override // X.KDD
    /* renamed from: A01 */
    public final UserSession getSession() {
        return (UserSession) this.A03.getValue();
    }

    @Override // X.KDD
    public final KZH A02() {
        KZH kzh = this.A00;
        if (kzh != null) {
            return kzh;
        }
        C14360o3.A0F("repository");
        throw C00O.createAndThrow();
    }

    @Override // X.KDD
    public final InterfaceC37172GZj A03() {
        InterfaceC37172GZj interfaceC37172GZj = this.A01;
        if (interfaceC37172GZj != null) {
            return interfaceC37172GZj;
        }
        C14360o3.A0F("delegate");
        throw C00O.createAndThrow();
    }

    @Override // X.KDD
    public final boolean A04() {
        return this.A02;
    }

    @Override // X.KDD
    public final boolean A05() {
        if (!this.A02) {
            UserSession session = getSession();
            C06090Tz c06090Tz = C06090Tz.A05;
            if (C18U.A06(c06090Tz, session, 36314914855324581L)) {
                if (super.A04 != null || C18U.A06(c06090Tz, getSession(), 36314914855586728L)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    @Override // X.KDD
    public final boolean A06() {
        return this.A04;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(-680206718);
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        super.A04 = requireArguments.getString(AbstractC43591JPw.A00(278));
        this.A02 = requireArguments.getBoolean("IS_CAMERA_DESTINATION_CLIPS_KEY");
        C0f9.A09(-1363654223, A02);
    }
}
