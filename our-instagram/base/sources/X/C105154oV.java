package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.R;

/* renamed from: X.4oV, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C105154oV {
    public Drawable A00;
    public ViewGroup A01;
    public ImageView A02;
    public TextView A03;
    public C25317BIm A04;
    public C92584Cs A05;
    public final int A06;
    public final Context A07;
    public final Resources A08;
    public final ViewStub A09;
    public final InterfaceC09390do A0A;
    public final InterfaceC09390do A0B;
    public final InterfaceC09390do A0C;
    public final InterfaceC09390do A0D;
    public final InterfaceC09390do A0E;
    public final InterfaceC09390do A0F;
    public final boolean A0G;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C105154oV(android.view.ViewStub r3) {
        /*
            r2 = this;
            r0 = 1
            X.C14360o3.A0B(r3, r0)
            android.content.Context r1 = r3.getContext()
            X.C14360o3.A07(r1)
            r0 = 0
            r2.<init>(r1, r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C105154oV.<init>(android.view.ViewStub):void");
    }

    public C105154oV(Context context, ViewStub viewStub, boolean z) {
        this.A07 = context;
        this.A0G = z;
        this.A09 = viewStub;
        Resources resources = context.getResources();
        C14360o3.A07(resources);
        this.A08 = resources;
        Resources resources2 = context.getResources();
        C14360o3.A07(resources2);
        this.A06 = resources2.getDimensionPixelSize(R.dimen.action_sheet_divider_margin_top);
        this.A0F = AbstractC09440dt.A01(new C9EA(this, 31));
        this.A0D = AbstractC09440dt.A01(new C9EA(this, 29));
        this.A0B = AbstractC09440dt.A00(EnumC09460dv.A02, new C9EA(this, 27));
        this.A0E = AbstractC09440dt.A01(new C9EA(this, 30));
        this.A0C = AbstractC09440dt.A01(new C9EA(this, 28));
        this.A0A = AbstractC09440dt.A01(new C9EA(this, 26));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C105154oV(android.widget.TextView r3, boolean r4) {
        /*
            r2 = this;
            r0 = 1
            X.C14360o3.A0B(r3, r0)
            android.content.Context r1 = r3.getContext()
            X.C14360o3.A07(r1)
            r0 = 0
            r2.<init>(r1, r0, r4)
            r2.A03 = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C105154oV.<init>(android.widget.TextView, boolean):void");
    }
}
