package X;

import android.util.Patterns;
import com.facebookpay.form.cell.text.TextCellParams;
import com.facebookpay.form.cell.text.TextValidatorParams;
import com.facebookpay.logging.FBPayLoggerData;
import com.fbpay.hub.form.params.FormLogEvents;
import com.fbpay.hub.form.params.FormParams;
import com.google.common.collect.ImmutableList;

/* loaded from: classes10.dex */
public abstract class S21 {
    /* JADX WARN: Type inference failed for: r1v4, types: [X.SHg, java.lang.Object] */
    public static final FormParams A00(FBPayLoggerData fBPayLoggerData, FormLogEvents formLogEvents, String str, String str2, boolean z) {
        int i = str == null ? 2131961713 : 2131961714;
        int i2 = 2131962803;
        if (str2 == null) {
            i2 = 0;
        }
        C63184Sej c63184Sej = new C63184Sej(1, i, str2, i2);
        c63184Sej.A00 = fBPayLoggerData;
        c63184Sej.A02 = formLogEvents;
        C67664Uuw c67664Uuw = new C67664Uuw(1);
        c67664Uuw.A0B = str;
        c67664Uuw.A01(C05F.A0u);
        c67664Uuw.A03 = 2131954891;
        Integer num = C05F.A0N;
        String pattern = Patterns.EMAIL_ADDRESS.pattern();
        C14360o3.A07(pattern);
        c67664Uuw.A0G.add((Object) new TextValidatorParams(num, pattern, 2131954889, 0));
        TextCellParams A00 = c67664Uuw.A00();
        ImmutableList.Builder builder = c63184Sej.A09;
        builder.add((Object) A00);
        C67663Uuv c67663Uuv = new C67663Uuv(16);
        int i3 = 2131954890;
        if (AbstractC58319PtB.A1O()) {
            i3 = 2131966607;
        }
        W4W.A00(c67663Uuv, builder, i3, z);
        ?? obj = new Object();
        obj.A03 = 2131962802;
        obj.A00 = 2131962800;
        return C63184Sej.A00(obj, c63184Sej, 2131962801);
    }
}
