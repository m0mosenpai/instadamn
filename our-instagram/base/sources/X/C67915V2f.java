package X;

import android.content.Context;
import android.text.TextUtils;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.V2f, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C67915V2f extends C7E1 {
    public C69251VkK A00;
    public VDZ A01;
    public CharSequence A02;
    public String A03;
    public final List A04 = new ArrayList();
    public final V31 A05;
    public final V32 A06;
    public final V3P A07;
    public final V3L A08;
    public final C26958Buz A09;
    public final V3M A0A;

    public C67915V2f(Context context, UserSession userSession, V1X v1x, V1X v1x2) {
        V3M v3m = new V3M(context, v1x);
        this.A0A = v3m;
        V3L v3l = new V3L(context);
        this.A08 = v3l;
        V3P v3p = new V3P(context, userSession);
        this.A07 = v3p;
        V31 v31 = new V31(context, v1x2);
        this.A05 = v31;
        C26958Buz c26958Buz = new C26958Buz(context, userSession);
        this.A09 = c26958Buz;
        V32 v32 = new V32(context, userSession);
        this.A06 = v32;
        A0B(v3m, v3l, v3p, v31, c26958Buz, v32);
    }

    public static void A00(C67915V2f c67915V2f) {
        c67915V2f.A06();
        String str = c67915V2f.A03;
        if (str != null) {
            CharSequence charSequence = c67915V2f.A02;
            if (charSequence != null) {
                c67915V2f.A09(c67915V2f.A06, new VgU(str, charSequence), new C69312VlK(null, null, null, null, false));
            } else {
                c67915V2f.A09(c67915V2f.A08, str, new C69312VlK(null, null, null, null, false));
            }
        }
        for (Object obj : c67915V2f.A04) {
            Object obj2 = c67915V2f.A01;
            if (obj2 == null) {
                obj2 = VDZ.A03;
            }
            c67915V2f.A09(c67915V2f.A0A, obj, obj2);
        }
        C69251VkK c69251VkK = c67915V2f.A00;
        if (c69251VkK != null) {
            ILV ilv = c69251VkK.A01;
            if (ilv != null && !TextUtils.isEmpty(ilv.A00)) {
                C69251VkK c69251VkK2 = c67915V2f.A00;
                Object obj3 = c69251VkK2.A01.A00;
                boolean z = c69251VkK2.A03;
                int i = R.drawable.instagram_chevron_up_pano_outline_24;
                if (z) {
                    i = R.drawable.instagram_chevron_down_pano_outline_24;
                }
                c67915V2f.A09(c67915V2f.A05, obj3, new C69312VlK(null, null, null, Integer.valueOf(i), true));
            }
            C69251VkK c69251VkK3 = c67915V2f.A00;
            if (!c69251VkK3.A03) {
                ILV ilv2 = c69251VkK3.A00;
                if (ilv2 != null) {
                    c67915V2f.A09(c67915V2f.A07, ilv2.A00, new C69312VlK(Integer.valueOf(R.dimen.action_bar_item_spacing_left), Integer.valueOf(R.dimen.abc_control_corner_material), null, null, false));
                }
                Iterator it = Collections.unmodifiableList(c67915V2f.A00.A02).iterator();
                while (it.hasNext()) {
                    c67915V2f.A08(c67915V2f.A09, ((VJ3) it.next()).A00.A00());
                }
            }
        }
        c67915V2f.A07();
    }
}
