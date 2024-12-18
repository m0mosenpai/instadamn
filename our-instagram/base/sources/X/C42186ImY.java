package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.Iterator;
import org.json.JSONArray;

/* renamed from: X.ImY, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42186ImY implements C5R5 {
    public boolean A00;
    public final C5R5 A01;
    public final String A02;

    @Override // X.C5R5
    public final C1ON BDA(UserSession userSession, boolean z) {
        C14360o3.A0B(userSession, 0);
        JSONArray jSONArray = new JSONArray();
        Iterator it = AbstractC001900j.A0Q(this.A02, new char[]{','}, 0).iterator();
        while (it.hasNext()) {
            jSONArray.put(it.next());
        }
        String A19 = AbstractC166987dD.A19(jSONArray);
        C25621Ms A0M = AbstractC31177DnL.A0M(userSession);
        A0M.A0R(C38960HDm.class, C41304IPt.class);
        A0M.A0B("clips/items/");
        A0M.A0H("clips_media_ids", A19);
        return A0M.A0N();
    }

    @Override // X.C5R5
    public final C1ON C57(UserSession userSession, String str) {
        C14360o3.A0B(userSession, 0);
        if (this.A00) {
            this.A00 = false;
            return this.A01.BDA(userSession, false);
        }
        return this.A01.C57(userSession, str);
    }

    @Override // X.C5R5
    public final /* synthetic */ void ERc(C37682GiJ c37682GiJ) {
    }

    @Override // X.C5R5
    public final /* synthetic */ void ES6(Context context) {
    }

    @Override // X.C5R5
    public final /* synthetic */ void EcO(String str) {
    }

    @Override // X.C5R5
    public final /* synthetic */ void Eee(InterfaceC120815dY interfaceC120815dY) {
    }

    public C42186ImY(C5R5 c5r5, String str) {
        boolean A1V = AbstractC167007dF.A1V(c5r5);
        this.A02 = str;
        this.A01 = c5r5;
        this.A00 = A1V;
    }

    @Override // X.C5R5
    public final /* synthetic */ boolean CUz(boolean z) {
        return false;
    }
}
