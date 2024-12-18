package X;

import android.content.Context;
import android.widget.ImageView;
import com.facebook.R;

/* renamed from: X.8G3, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8G3 extends AnonymousClass834 {
    public final ImageView A00;
    public final C8G6 A01;
    public final C138586Po A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8G3(ImageView imageView) {
        super(imageView);
        C14360o3.A0B(imageView, 1);
        this.A00 = imageView;
        Context context = imageView.getContext();
        int color = context.getColor(R.color.audio_bar_action_color_enabled);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.achievements_only_you_top_margin);
        C138586Po A00 = AbstractC138576Pn.A00(0.6666667f, dimensionPixelSize, false);
        int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(R.dimen.music_preview_button_sound_wave_bars_shadow_thickness);
        int color2 = context.getColor(R.color.black_6_transparent);
        int min = Math.min(dimensionPixelSize2, (A00.A07 - 1) / 2);
        A00.A03 = min;
        A00.A00 = A00.A06 + min;
        A00.A0B.setColor(color2);
        A00.invalidateSelf();
        this.A02 = A00;
        C8G4 c8g4 = new C8G4(context);
        Integer valueOf = Integer.valueOf(color);
        c8g4.A06 = valueOf;
        c8g4.A0C = valueOf;
        c8g4.A00 = A00;
        c8g4.A01 = A00;
        c8g4.A02(dimensionPixelSize);
        c8g4.A01(color);
        C8G6 A002 = c8g4.A00();
        this.A01 = A002;
        EW1(A002);
    }
}
