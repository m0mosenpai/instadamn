package X;

import android.content.Context;
import android.view.View;

/* loaded from: classes9.dex */
public abstract class OOy {
    public static final C50821Mcw A00(Context context, View.OnClickListener onClickListener, Integer num, int i) {
        C50821Mcw c50821Mcw = new C50821Mcw(context);
        c50821Mcw.setTitle(context.getResources().getString(i));
        C0fQ.A00(onClickListener, c50821Mcw);
        if (num != null) {
            c50821Mcw.setIcon(MSX.A07(context, num));
        }
        AbstractC50522MSa.A0z(c50821Mcw);
        return c50821Mcw;
    }

    public static final C52369NFj A01(Context context, Boolean bool, CharSequence charSequence, Integer num, int i) {
        String string = context.getResources().getString(i);
        C52369NFj c52369NFj = new C52369NFj(context);
        AbstractC50522MSa.A0y(c52369NFj);
        c52369NFj.setOrientation(1);
        c52369NFj.setTitle(string);
        if (num != null) {
            c52369NFj.setIcon(MSX.A07(context, num));
        }
        if (charSequence != null) {
            c52369NFj.setSubtitle(charSequence);
            if (bool != null) {
                c52369NFj.setInlineSubtitleLinkable(bool.booleanValue());
            }
        }
        return c52369NFj;
    }
}
