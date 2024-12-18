package X;

import android.content.Context;
import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.common.session.UserSession;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: X.82L, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C82L implements C82M {
    public final UserSession A00;
    public final C82G A01;
    public final C82H A02;
    public final C82I A03;
    public final boolean A04;

    public C82L(C82G c82g, C82H c82h, C82I c82i, UserSession userSession, boolean z) {
        C14360o3.A0B(userSession, 1);
        C14360o3.A0B(c82g, 2);
        C14360o3.A0B(c82h, 3);
        C14360o3.A0B(c82i, 4);
        this.A00 = userSession;
        this.A01 = c82g;
        this.A02 = c82h;
        this.A03 = c82i;
        this.A04 = z;
    }

    public final void A02(Context context, InterfaceC25208BDg interfaceC25208BDg) {
        C191758eX A01 = A01(context, interfaceC25208BDg);
        IgBloksScreenConfig igBloksScreenConfig = new IgBloksScreenConfig(this.A00);
        igBloksScreenConfig.A0R = "com.bloks.www.cxp.xposting_upsells.native_shell";
        igBloksScreenConfig.A0k = false;
        igBloksScreenConfig.A0p = true;
        if (interfaceC25208BDg != null) {
            igBloksScreenConfig.A05 = new C215029fe(interfaceC25208BDg);
        }
        if (A01.A01.nextClearBit(0) >= 1) {
            C191758eX.A00(A01).A05(A01.A00, igBloksScreenConfig);
            return;
        }
        throw new IllegalStateException(MSV.A00(13));
    }

    public final void A03(Context context, final InterfaceC191748eW interfaceC191748eW) {
        AbstractC191798eb.A00(context, new C191778eZ(this.A00), "com.bloks.www.cxp.xposting_upsells.native_shell", null, AbstractC191768eY.A01(A01(context, null).A03), 900L).A9b(new InterfaceC192128fD() { // from class: X.8fC
            @Override // X.InterfaceC192128fD
            public final void Dgh(AbstractC192138fE abstractC192138fE) {
                C14360o3.A0B(abstractC192138fE, 0);
                InterfaceC191748eW interfaceC191748eW2 = InterfaceC191748eW.this;
                int i = abstractC192138fE.A00.A00;
                boolean z = true;
                if (i != 0 && i != 1 && i != 2) {
                    z = false;
                }
                interfaceC191748eW2.Dgk(z);
            }
        });
    }

    @Override // X.C82M
    public final /* synthetic */ void A7T(Parcelable parcelable) {
    }

    public final C191758eX A01(Context context, InterfaceC25208BDg interfaceC25208BDg) {
        C191758eX c191758eX = new C191758eX(context);
        String str = this.A01.A00;
        Map map = c191758eX.A03;
        map.put("crosspost_upsell_entrypoint", str);
        c191758eX.A01.set(0);
        map.put("crosspost_upsell_variant", this.A02.A00);
        map.put("should_dismiss", Boolean.valueOf(this.A04));
        if (interfaceC25208BDg != null) {
            c191758eX.A02.put("action_callback", new C66237U5h(new C24989B3l(c191758eX, new JEZ(interfaceC25208BDg, 35))));
        }
        map.put("extras_json", new JSONObject(this.A03.A00).toString());
        return c191758eX;
    }

    @Override // X.C82M
    public final /* synthetic */ Parcelable ANh() {
        return null;
    }

    public final Fragment A00(Context context, InterfaceC25208BDg interfaceC25208BDg) {
        C191758eX A01 = A01(context, interfaceC25208BDg);
        IgBloksScreenConfig igBloksScreenConfig = new IgBloksScreenConfig(this.A00);
        igBloksScreenConfig.A0R = "com.bloks.www.cxp.xposting_upsells.native_shell";
        igBloksScreenConfig.A0k = false;
        igBloksScreenConfig.A0p = true;
        igBloksScreenConfig.A05 = new C215029fe(interfaceC25208BDg);
        if (A01.A01.nextClearBit(0) >= 1) {
            C72743Nv A03 = C191758eX.A00(A01).A03(A01.A00, igBloksScreenConfig);
            C14360o3.A07(A03);
            return A03;
        }
        throw new IllegalStateException(MSV.A00(13));
    }
}
