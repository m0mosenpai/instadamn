package X;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* loaded from: classes11.dex */
public final class V32 extends AbstractC65632xz {
    public final Context A00;
    public final LayoutInflater A01;
    public final UserSession A02;

    @Override // X.InterfaceC65642y0
    public final /* bridge */ /* synthetic */ void buildRowViewTypes(AnonymousClass306 anonymousClass306, Object obj, Object obj2) {
        anonymousClass306.A7a(0);
    }

    @Override // X.InterfaceC65642y0
    public final int getViewTypeCount() {
        return 1;
    }

    public V32(Context context, UserSession userSession) {
        this.A00 = context;
        this.A01 = LayoutInflater.from(context);
        this.A02 = userSession;
    }

    @Override // X.InterfaceC65642y0
    public final void bindView(int i, View view, Object obj, Object obj2) {
        int i2;
        int i3;
        int A03 = C0f9.A03(1912403152);
        view.getTag().getClass();
        VgU vgU = (VgU) obj;
        Context context = this.A00;
        C69171Vj0 c69171Vj0 = (C69171Vj0) view.getTag();
        CharSequence charSequence = vgU.A01;
        CharSequence charSequence2 = vgU.A00;
        C69312VlK c69312VlK = (C69312VlK) obj2;
        Resources resources = context.getResources();
        View view2 = c69171Vj0.A00;
        Integer num = c69312VlK.A03;
        if (num != null) {
            i2 = num.intValue();
        } else {
            i2 = R.dimen.ab_test_media_thumbnail_preview_item_internal_padding;
        }
        int dimensionPixelSize = resources.getDimensionPixelSize(i2);
        Integer num2 = c69312VlK.A00;
        if (num2 != null) {
            i3 = num2.intValue();
        } else {
            i3 = R.dimen.ab_test_media_thumbnail_preview_item_internal_padding;
        }
        int i4 = 0;
        view2.setPadding(0, dimensionPixelSize, 0, resources.getDimensionPixelSize(i3));
        if (c69312VlK.A01 != null) {
            c69171Vj0.A02.setTextSize(0, resources.getDimensionPixelSize(r0.intValue()));
        }
        TextView textView = c69171Vj0.A02;
        textView.setText(charSequence);
        c69171Vj0.A01.setText(charSequence2);
        if (c69312VlK.A04) {
            i4 = 17;
        }
        textView.setGravity(i4);
        C0f9.A0A(-700852046, A03);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x001c, code lost:
    
        if (r1 == false) goto L6;
     */
    @Override // X.InterfaceC65642y0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View createView(int r8, android.view.ViewGroup r9) {
        /*
            r7 = this;
            r0 = -1603854331(0xffffffffa0672005, float:-1.9577055E-19)
            int r6 = X.C0f9.A03(r0)
            android.view.LayoutInflater r5 = r7.A01
            com.instagram.common.session.UserSession r4 = r7.A02
            r3 = 0
            if (r4 == 0) goto L1e
            X.0Tz r2 = X.C06090Tz.A06
            r0 = 36328894973886296(0x8110f000003f58, double:3.0378776939795695E-306)
            boolean r1 = X.C18U.A06(r2, r4, r0)
            r0 = 2131628995(0x7f0e13c3, float:1.8885298E38)
            if (r1 != 0) goto L21
        L1e:
            r0 = 2131628994(0x7f0e13c2, float:1.8885296E38)
        L21:
            android.view.View r1 = r5.inflate(r0, r3)
            X.Vj0 r0 = new X.Vj0
            r0.<init>(r1)
            r1.setTag(r0)
            r0 = -1297424978(0xffffffffb2aaddae, float:-1.9891413E-8)
            X.C0f9.A0A(r0, r6)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.V32.createView(int, android.view.ViewGroup):android.view.View");
    }
}
