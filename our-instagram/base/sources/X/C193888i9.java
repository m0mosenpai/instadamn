package X;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.facebook.quicklog.reliability.CancelReason;
import com.instagram.common.session.UserSession;
import java.util.Map;

/* renamed from: X.8i9, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C193888i9 implements InterfaceC23471Cj {
    public C195838lR A00;
    public boolean A01;
    public boolean A02;
    public final Activity A03;
    public final C8J0 A04;
    public final C193838i4 A05;
    public final View.OnClickListener A06;
    public final ViewGroup A07;
    public final UserSession A08;

    public C193888i9(Activity activity, ViewGroup viewGroup, UserSession userSession, C8J0 c8j0, C193838i4 c193838i4) {
        C14360o3.A0B(viewGroup, 3);
        this.A03 = activity;
        this.A04 = c8j0;
        this.A07 = viewGroup;
        this.A05 = c193838i4;
        this.A08 = userSession;
        this.A06 = new View.OnClickListener() { // from class: X.8iA
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int A05 = C0f9.A05(1564134882);
                C193888i9 c193888i9 = C193888i9.this;
                Activity activity2 = c193888i9.A03;
                if (AbstractC93174Ft.A03(activity2)) {
                    c193888i9.A04.A00();
                    C195838lR c195838lR = c193888i9.A00;
                    if (c195838lR != null) {
                        c195838lR.A00();
                    }
                    c193888i9.A00 = null;
                    c193888i9.A05.A0V();
                } else if (c193888i9.A01) {
                    WGH.A06(activity2, null);
                } else {
                    c193888i9.A02 = false;
                    c193888i9.A02 = true;
                    AbstractC93174Ft.A01(activity2, c193888i9);
                }
                C0f9.A0C(-1057703095, A05);
            }
        };
    }

    @Override // X.InterfaceC23471Cj
    public final void DYE(Map map) {
        C193838i4 c193838i4;
        C14360o3.A0B(map, 0);
        boolean z = false;
        this.A02 = false;
        EnumC172127lh A00 = AbstractC93174Ft.A00(map);
        if (A00 == EnumC172127lh.A04) {
            z = true;
        }
        this.A01 = z;
        if (A00 != EnumC172127lh.A05 && !AbstractC93174Ft.A03(this.A03)) {
            c193838i4 = this.A05;
            c193838i4.A0b();
        } else {
            this.A04.A00();
            C195838lR c195838lR = this.A00;
            if (c195838lR != null) {
                c195838lR.A00();
            }
            this.A00 = null;
            c193838i4 = this.A05;
            c193838i4.A0V();
        }
        c193838i4.A0a();
    }

    public final void A00(String str) {
        int i;
        this.A05.A0a();
        if (this.A00 == null) {
            C8J0 c8j0 = this.A04;
            c8j0.A03.A06(CancelReason.SYSTEM_CANCELLED, "gallery permissions denied", 518928411, c8j0.A01);
            ViewGroup viewGroup = this.A07;
            C195838lR c195838lR = new C195838lR(viewGroup, R.layout.permission_empty_state_view);
            Activity activity = this.A03;
            Context applicationContext = activity.getApplicationContext();
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 33) {
                i = 2131963113;
            } else {
                i = 2131963121;
                if (i2 >= 30) {
                    i = 2131963085;
                }
            }
            String string = applicationContext.getString(i);
            C14360o3.A0A(string);
            String string2 = applicationContext.getString(2131963122, string);
            C14360o3.A07(string2);
            c195838lR.A05(string2);
            c195838lR.A04(activity.getString(2131963124));
            c195838lR.A02(2131963123);
            c195838lR.A01();
            c195838lR.A03(this.A06);
            this.A00 = c195838lR;
            if (str != null) {
                C1KM.A09.A0L(String.valueOf(viewGroup.hashCode()), "gallery permissions denied", str);
            }
        }
    }
}
