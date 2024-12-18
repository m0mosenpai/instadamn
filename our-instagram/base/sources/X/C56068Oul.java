package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import java.util.Map;

/* renamed from: X.Oul, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56068Oul implements InterfaceC23471Cj {
    public final /* synthetic */ FragmentActivity A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ C38321qM A02;
    public final /* synthetic */ InterfaceC60442pS A03;
    public final /* synthetic */ C75113Zb A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ boolean A07;

    public C56068Oul(FragmentActivity fragmentActivity, UserSession userSession, C38321qM c38321qM, InterfaceC60442pS interfaceC60442pS, C75113Zb c75113Zb, String str, String str2, boolean z) {
        this.A00 = fragmentActivity;
        this.A01 = userSession;
        this.A03 = interfaceC60442pS;
        this.A05 = str;
        this.A06 = str2;
        this.A02 = c38321qM;
        this.A04 = c75113Zb;
        this.A07 = z;
    }

    @Override // X.InterfaceC23471Cj
    public final void DYE(Map map) {
        C14360o3.A0B(map, 0);
        EnumC172127lh enumC172127lh = (EnumC172127lh) map.get("android.permission.WRITE_EXTERNAL_STORAGE");
        if (enumC172127lh != null) {
            int ordinal = enumC172127lh.ordinal();
            if (ordinal != 0) {
                if (ordinal != 1 && ordinal != 2) {
                    return;
                }
                C9GR.A01(this.A00, "save_fail_external_storage_permission", 2131972727, 1);
                return;
            }
            C55220Oej c55220Oej = C55220Oej.A00;
            C55220Oej.A04(this.A00, this.A01, this.A02, this.A03, this.A04, c55220Oej, this.A05, this.A06, this.A07);
        }
    }
}
