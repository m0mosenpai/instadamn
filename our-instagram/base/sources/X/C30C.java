package X;

import android.content.Context;
import android.content.res.Resources;
import com.facebook.R;

/* renamed from: X.30C, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C30C {
    public C80113i0 A00;
    public C86473tK A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final Context A07;
    public final InterfaceC65702y7 A08 = new Object();

    /* JADX WARN: Type inference failed for: r0v0, types: [X.2y7, java.lang.Object] */
    public C30C(Context context) {
        int color;
        this.A07 = context;
        this.A02 = AbstractC53242c7.A0F(context, R.attr.textColorLocation);
        try {
            color = context.getColor(AbstractC53242c7.A0H(context, R.attr.igds_color_secondary_text));
        } catch (Resources.NotFoundException e) {
            AbstractC53172bz.A03(this.A07, e);
            context.getTheme().applyStyle(AbstractC53172bz.A00(), true);
            color = context.getColor(AbstractC53242c7.A0H(context, R.attr.igds_color_secondary_text));
        }
        this.A06 = color;
        Resources resources = context.getResources();
        this.A04 = resources.getDimensionPixelSize(R.dimen.container_height);
        this.A03 = resources.getDimensionPixelSize(R.dimen.abc_alert_dialog_button_dimen);
        this.A05 = resources.getDimensionPixelSize(R.dimen.abc_edit_text_inset_top_material);
    }
}
