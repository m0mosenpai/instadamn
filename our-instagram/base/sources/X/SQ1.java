package X;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.facebookpay.logging.FBPayLoggerData;
import java.util.Map;

/* loaded from: classes10.dex */
public final class SQ1 {
    public C63629Sqb A00;
    public final C2GC A01;
    public final SBk A02;
    public final C62962SZf A03;
    public final SNK A04;
    public final Context A05;
    public final C63337Shp A06;
    public final C63337Shp A07;
    public final SVW A08;
    public final C63174SeZ A09;
    public final C58443PvM A0A;
    public final C62567SGs A0B;

    public final C63345Si1 A01(Fragment fragment) {
        return new C63345Si1(C63345Si1.A08, fragment, null, this, this.A0A);
    }

    public final C63345Si1 A02(FragmentActivity fragmentActivity) {
        return new C63345Si1(C63345Si1.A08, null, fragmentActivity, this, this.A0A);
    }

    public final C63629Sqb A00() {
        C63629Sqb c63629Sqb = this.A00;
        if (c63629Sqb == null) {
            Context context = this.A05;
            C62962SZf c62962SZf = this.A03;
            C63337Shp c63337Shp = this.A07;
            C63337Shp c63337Shp2 = this.A06;
            C62567SGs c62567SGs = this.A0B;
            C63629Sqb c63629Sqb2 = new C63629Sqb(context, c63337Shp, c63337Shp2, c62962SZf, this.A09, this.A0A, c62567SGs);
            this.A00 = c63629Sqb2;
            return c63629Sqb2;
        }
        return c63629Sqb;
    }

    public final T33 A03(Context context, Class cls) {
        Number number;
        int intValue;
        SVW svw = this.A08;
        if (context == null) {
            context = this.A05;
        }
        if (cls.equals(C60609RDe.class)) {
            return new T33(new T34(context, SVW.A00(svw, cls)), R.layout.fbpay_auth_cvv);
        }
        if (cls.equals(C60611RDg.class)) {
            return new T33(new T34(context, SVW.A00(svw, cls)), R.layout.fbpay_auth_settings_fragment);
        }
        if (cls.equals(C60612RDh.class)) {
            int A00 = SVW.A00(svw, cls);
            C3AY c3ay = (C3AY) svw.A00.get(cls);
            if (c3ay != null && (number = (Number) c3ay.A01) != null && (intValue = number.intValue()) != 0) {
                return new T33(new T34(context, A00), intValue);
            }
            throw AbstractC37303Gc4.A0M(cls, "Layout is not provided for Fragment Decorator!", AbstractC166987dD.A1C());
        }
        if (cls.equals(C60610RDf.class)) {
            return new T33(new T34(context, SVW.A00(svw, cls)), R.layout.auth_edit_text_screen);
        }
        throw AbstractC37303Gc4.A0M(cls, "Not aware about decorator Class :", AbstractC166987dD.A1C());
    }

    public final void A04(Bundle bundle) {
        String string = bundle.getString("PAYMENT_TYPE");
        FBPayLoggerData fBPayLoggerData = (FBPayLoggerData) bundle.getParcelable("logger_data");
        if (!TextUtils.isEmpty(string) && fBPayLoggerData != null) {
            C62567SGs c62567SGs = this.A0B;
            string.getClass();
            Map map = c62567SGs.A02;
            C14360o3.A06(map);
            Object obj = map.get(string);
            if (obj == null) {
                obj = new C62953SYv(c62567SGs.A00, c62567SGs.A01);
                map.put(string, obj);
            }
            ((C62953SYv) obj).A00(fBPayLoggerData, C05F.A01, string);
        }
        C62962SZf c62962SZf = this.A03;
        c62962SZf.A01();
        REN ren = c62962SZf.A00.A01.A01;
        AbstractC63144Sdq.A01(ren.A03.A00, ren);
    }

    public SQ1(Context context, C63337Shp c63337Shp, C63337Shp c63337Shp2, C2GC c2gc, SVW svw, C62962SZf c62962SZf, SNK snk, C63174SeZ c63174SeZ, C58443PvM c58443PvM, C62567SGs c62567SGs) {
        this.A05 = context;
        this.A03 = c62962SZf;
        this.A04 = snk;
        this.A01 = c2gc;
        this.A08 = svw;
        this.A07 = c63337Shp;
        this.A06 = c63337Shp2;
        this.A0B = c62567SGs;
        this.A0A = c58443PvM;
        this.A09 = c63174SeZ;
        this.A02 = new SBk(c62962SZf);
    }
}
