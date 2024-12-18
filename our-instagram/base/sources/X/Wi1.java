package X;

import android.view.View;
import com.instagram.common.session.UserSession;

/* loaded from: classes11.dex */
public final class Wi1 implements InterfaceC13380mO {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public Wi1(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // X.InterfaceC13380mO
    public final /* bridge */ /* synthetic */ void onDebouncedValue(Object obj) {
        C69691Vtl c69691Vtl;
        String str;
        C61972ry c61972ry;
        C1OL c1ol;
        C25621Ms A0M;
        String str2;
        Class cls;
        Class cls2;
        switch (this.A00) {
            case 0:
                c69691Vtl = (C69691Vtl) obj;
                C14360o3.A0B(c69691Vtl, 0);
                if (c69691Vtl.equals(C69691Vtl.A02)) {
                    return;
                }
                C69691Vtl.A02 = c69691Vtl;
                C13400mQ c13400mQ = (C13400mQ) ((C15370ps) this.A01).A00;
                if (c13400mQ != null) {
                    c13400mQ.A00();
                }
                str = c69691Vtl.A01;
                if (str == null) {
                    return;
                }
                C68955Vet c68955Vet = (C68955Vet) this.A02;
                c61972ry = c68955Vet.A00;
                UserSession userSession = c68955Vet.A01;
                c1ol = new C1OL();
                A0M = AbstractC31173DnH.A0M(userSession);
                str2 = "ads/promote/address_location_typeahead/";
                A0M.A0E = str2;
                A0M.A9s("query", str);
                cls = C67809Uyi.class;
                cls2 = C69907VxY.class;
                A0M.A0S(cls, cls2);
                A0M.A00 = c1ol;
                C1ON A0N = A0M.A0N();
                A0N.A00 = c69691Vtl.A00;
                c61972ry.schedule(A0N);
                return;
            case 1:
                c69691Vtl = (C69691Vtl) obj;
                C14360o3.A0B(c69691Vtl, 0);
                if (c69691Vtl.equals(C69691Vtl.A02)) {
                    return;
                }
                C69691Vtl.A02 = c69691Vtl;
                C13400mQ c13400mQ2 = (C13400mQ) ((C15370ps) this.A01).A00;
                if (c13400mQ2 != null) {
                    c13400mQ2.A00();
                }
                String str3 = c69691Vtl.A01;
                if (str3 == null) {
                    return;
                }
                C68955Vet c68955Vet2 = (C68955Vet) this.A02;
                c61972ry = c68955Vet2.A00;
                UserSession userSession2 = c68955Vet2.A01;
                c1ol = new C1OL();
                A0M = AbstractC31173DnH.A0M(userSession2);
                A0M.A0B("ads/promote/interest_typeahead/");
                A0M.A9s("fb_auth_token", "");
                A0M.A9s("query", str3);
                cls = C67808Uyh.class;
                cls2 = C69905VxW.class;
                A0M.A0S(cls, cls2);
                A0M.A00 = c1ol;
                C1ON A0N2 = A0M.A0N();
                A0N2.A00 = c69691Vtl.A00;
                c61972ry.schedule(A0N2);
                return;
            case 2:
                c69691Vtl = (C69691Vtl) obj;
                C14360o3.A0B(c69691Vtl, 0);
                if (c69691Vtl.equals(C69691Vtl.A02)) {
                    return;
                }
                C69691Vtl.A02 = c69691Vtl;
                C13400mQ c13400mQ3 = (C13400mQ) ((C15370ps) this.A01).A00;
                if (c13400mQ3 != null) {
                    c13400mQ3.A00();
                }
                str = c69691Vtl.A01;
                if (str == null) {
                    return;
                }
                C68955Vet c68955Vet3 = (C68955Vet) this.A02;
                c61972ry = c68955Vet3.A00;
                UserSession userSession3 = c68955Vet3.A01;
                c1ol = new C1OL();
                A0M = AbstractC31173DnH.A0M(userSession3);
                str2 = "ads/promote/regional_location_typeahead/";
                A0M.A0E = str2;
                A0M.A9s("query", str);
                cls = C67809Uyi.class;
                cls2 = C69907VxY.class;
                A0M.A0S(cls, cls2);
                A0M.A00 = c1ol;
                C1ON A0N22 = A0M.A0N();
                A0N22.A00 = c69691Vtl.A00;
                c61972ry.schedule(A0N22);
                return;
            default:
                View view = (View) obj;
                C14360o3.A0B(view, 0);
                C189478aR c189478aR = ((IE2) this.A01).A00;
                if (c189478aR != null) {
                    c189478aR.A07();
                }
                ((View.OnClickListener) this.A02).onClick(view);
                return;
        }
    }
}
