package X;

import android.app.TimePickerDialog;
import android.content.Context;
import android.text.format.DateFormat;
import android.widget.CompoundButton;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import com.instagram.realtimeclient.RealtimeSubscription;

/* renamed from: X.Ele, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C33244Ele extends C36731GHa {
    public C33621EtX A00;
    public C33621EtX A01;
    public boolean A02;
    public boolean A03;
    public final Context A04;
    public final CompoundButton.OnCheckedChangeListener A05;
    public final FHU A06;
    public final C35033Fc6 A07;
    public final String A08;
    public final Fragment A09;
    public final UserSession A0A;

    public static void A00(CompoundButton compoundButton, C33244Ele c33244Ele) {
        String str;
        Fragment fragment = c33244Ele.A09;
        AbstractC63248Sg4.A02(fragment.getParentFragmentManager());
        boolean z = c33244Ele.A02;
        C33621EtX c33621EtX = c33244Ele.A01;
        if (z) {
            str = RealtimeSubscription.GRAPHQL_MQTT_VERSION;
        } else {
            str = "0";
        }
        String A0g = AnonymousClass001.A0g(str, "-", c33621EtX.toString());
        C35033Fc6 c35033Fc6 = c33244Ele.A07;
        String str2 = c33244Ele.A08;
        c35033Fc6.A01(str2, A0g, "time_range");
        Context context = c33244Ele.A04;
        C08790ch A00 = AbstractC018607g.A00(fragment);
        C1ON A01 = FXB.A01(c33244Ele.A0A, str2, A0g);
        A01.A00 = new C33128EjX(compoundButton, fragment.mFragmentManager, c33621EtX, c33244Ele, c33244Ele.A03, c33244Ele.A02);
        C1GJ.A00(context, A00, A01);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000d, code lost:
    
        if (r0 == false) goto L6;
     */
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C33244Ele(android.content.Context r4, androidx.fragment.app.Fragment r5, com.instagram.common.session.UserSession r6, X.E6O r7, X.FHU r8, X.C35033Fc6 r9, X.C33621EtX r10, X.GHY r11, X.GHY r12) {
        /*
            r3 = this;
            java.lang.String r2 = r7.A03
            java.lang.String r1 = r7.A02
            if (r1 == 0) goto Lf
            java.lang.String r0 = "1"
            boolean r0 = r1.startsWith(r0)
            r1 = 1
            if (r0 != 0) goto L10
        Lf:
            r1 = 0
        L10:
            r0 = 0
            r3.<init>(r0, r2, r1)
            r1 = 46
            X.Fqd r0 = new X.Fqd
            r0.<init>(r3, r1)
            r3.A05 = r0
            r3.A08 = r0
            java.lang.String r0 = r7.A01
            r3.A08 = r0
            r3.A06 = r8
            boolean r0 = r3.A0D
            r3.A03 = r0
            r3.A00 = r10
            r3.A01 = r10
            r3.A04 = r4
            r3.A0A = r6
            r3.A09 = r5
            r3.A07 = r9
            r0 = 27
            X.FpO r0 = X.ViewOnClickListenerC35689FpO.A00(r3, r0)
            r11.A05 = r0
            r0 = 28
            X.FpO r0 = X.ViewOnClickListenerC35689FpO.A00(r3, r0)
            r12.A05 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C33244Ele.<init>(android.content.Context, androidx.fragment.app.Fragment, com.instagram.common.session.UserSession, X.E6O, X.FHU, X.Fc6, X.EtX, X.GHY, X.GHY):void");
    }

    public static void A01(GYI gyi, C33244Ele c33244Ele, String str, String str2) {
        String str3;
        String[] split = str2.split(":");
        String str4 = "00";
        if (split.length != 2) {
            str3 = "00";
        } else {
            str4 = split[0];
            str3 = split[1];
        }
        int parseInt = Integer.parseInt(str4);
        int parseInt2 = Integer.parseInt(str3);
        Context context = c33244Ele.A04;
        TimePickerDialog timePickerDialog = new TimePickerDialog(context, new C35293FhS(gyi, c33244Ele), parseInt, parseInt2, DateFormat.is24HourFormat(context));
        timePickerDialog.setTitle(str);
        C0fJ.A00(timePickerDialog);
    }
}
