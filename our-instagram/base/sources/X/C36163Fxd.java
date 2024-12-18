package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import java.util.Arrays;
import java.util.Map;

/* renamed from: X.Fxd, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36163Fxd implements InterfaceC23471Cj {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final String A03;

    public C36163Fxd(Object obj, Object obj2, String str, int i) {
        this.A00 = i;
        this.A01 = obj;
        this.A03 = str;
        this.A02 = obj2;
    }

    @Override // X.InterfaceC23471Cj
    public final void DYE(Map map) {
        String str;
        switch (this.A00) {
            case 0:
                C14360o3.A0B(map, 0);
                Object obj = map.get("android.permission.CALL_PHONE");
                EnumC172127lh enumC172127lh = EnumC172127lh.A05;
                Context context = (Context) this.A01;
                String str2 = this.A03;
                C64480TFq c64480TFq = (C64480TFq) this.A02;
                if (obj == enumC172127lh) {
                    C64480TFq.A01(c64480TFq, AbstractC58317Pt9.A00(262));
                    str = AbstractC58317Pt9.A00(223);
                } else {
                    C64480TFq.A01(c64480TFq, "ctc_call_initiated_indirectly");
                    str = "android.intent.action.DIAL";
                }
                C12260kU.A00(context, AbstractC31173DnH.A09(new Intent(str), AbstractC08820cl.A03(str2)));
                return;
            case 1:
                C14360o3.A0B(map, 0);
                AGK agk = (AGK) this.A02;
                TextView textView = (TextView) this.A01;
                String str3 = this.A03;
                Object obj2 = map.get(str3);
                if (obj2 != null) {
                    AGK.A00(textView, agk, str3);
                    EnumC172127lh enumC172127lh2 = EnumC172127lh.A04;
                    Activity activity = agk.A01;
                    if (obj2 == enumC172127lh2) {
                        WGH.A06(activity, null);
                        return;
                    }
                    Map map2 = agk.A05;
                    String[] strArr = (String[]) map2.keySet().toArray(new String[0]);
                    if (!AbstractC23451Ch.A08(activity, (String[]) Arrays.copyOf(strArr, strArr.length))) {
                        return;
                    }
                    InterfaceC23471Cj interfaceC23471Cj = agk.A00;
                    String[] strArr2 = (String[]) map2.keySet().toArray(new String[0]);
                    AbstractC23451Ch.A04(activity, interfaceC23471Cj, (String[]) Arrays.copyOf(strArr2, strArr2.length));
                    return;
                }
                throw AbstractC166997dE.A0g();
            default:
                C14360o3.A0B(map, 0);
                Object obj3 = map.get("android.permission.CALL_PHONE");
                EnumC172127lh enumC172127lh3 = EnumC172127lh.A05;
                FragmentActivity fragmentActivity = (FragmentActivity) this.A01;
                String str4 = this.A03;
                C64480TFq c64480TFq2 = (C64480TFq) this.A02;
                if (obj3 == enumC172127lh3) {
                    C64480TFq.A01(c64480TFq2, AbstractC58317Pt9.A00(262));
                    C12260kU.A00(fragmentActivity, AbstractC31173DnH.A09(new Intent(AbstractC58317Pt9.A00(223)), AbstractC08820cl.A03(str4)));
                    return;
                } else {
                    C64480TFq.A01(c64480TFq2, "ctc_call_initiated_indirectly");
                    AbstractC41776Ies.A06(fragmentActivity, null, EnumC906041v.AD_DESTINATION_PHONE, null, str4, null, null);
                    return;
                }
        }
    }
}
