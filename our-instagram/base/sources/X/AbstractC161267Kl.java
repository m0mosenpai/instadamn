package X;

import android.content.Context;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.view.View;
import android.widget.ImageView;
import com.facebook.R;

/* renamed from: X.7Kl, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC161267Kl implements InterfaceC161277Km {
    public final C161227Kh A00;
    public final C161287Kn A01;
    public final C7Ko A02;
    public final C161237Ki A03;
    public final C161247Kj A04;

    public final boolean A04(C47701L4i c47701L4i, String str, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2, boolean z) {
        C74O c74o;
        ImageView imageView = c47701L4i.A06;
        Drawable drawable = null;
        if (imageView != null) {
            drawable = imageView.getDrawable();
        }
        if (!(drawable instanceof C74O) || (c74o = (C74O) drawable) == null) {
            return false;
        }
        this.A01.A00.add(str);
        if (c74o.A0A == null) {
            c74o.A9I(new C48539Ldc(c47701L4i, this, c74o, str, interfaceC16820sZ, interfaceC16820sZ2, z));
            return true;
        }
        A00(c47701L4i, this, c74o, str, interfaceC16820sZ, interfaceC16820sZ2, z);
        return true;
    }

    @Override // X.InterfaceC161277Km
    public void ADX(C47701L4i c47701L4i, C7L3 c7l3, String str, boolean z, boolean z2) {
        Paint paint;
        C14360o3.A0B(c47701L4i, 0);
        View view = c47701L4i.A01;
        if (view != null) {
            if (view.isLaidOut() && !view.isLayoutRequested()) {
                float height = view.getHeight();
                ShapeDrawable shapeDrawable = c47701L4i.A00;
                if (shapeDrawable != null && (paint = shapeDrawable.getPaint()) != null) {
                    Context context = view.getContext();
                    paint.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, height, new int[]{context.getColor(A03()), context.getColor(A02())}, (float[]) null, Shader.TileMode.CLAMP));
                    paint.setAlpha(255);
                    shapeDrawable.invalidateSelf();
                    return;
                }
                return;
            }
            view.addOnLayoutChangeListener(new LQC(view, c47701L4i, this));
        }
    }

    public final int A02() {
        if (this instanceof C161307Kr) {
            return R.color.avatar_powerups_laugh_bubble_to;
        }
        if (this instanceof C161257Kk) {
            return R.color.avatar_powerups_heart_bubble_to;
        }
        if (this instanceof C161317Ks) {
            return R.color.avatar_powerups_cry_bubble_to;
        }
        return R.color.avatar_powerups_angry_bubble_to;
    }

    public final int A03() {
        if (this instanceof C161307Kr) {
            return R.color.avatar_powerups_laugh_bubble_from;
        }
        if (this instanceof C161257Kk) {
            return R.color.avatar_powerups_heart_bubble_from;
        }
        if (this instanceof C161317Ks) {
            return R.color.avatar_powerups_cry_bubble_from;
        }
        return R.color.avatar_powerups_angry_bubble_from;
    }

    @Override // X.InterfaceC161277Km
    public boolean D3T(C47701L4i c47701L4i, C7L3 c7l3, String str, boolean z) {
        String A00;
        C161247Kj c161247Kj = this.A04;
        AnonymousClass541 CBO = CBO();
        C14360o3.A0B(CBO, 0);
        if (CBO.A02) {
            C18920wW c18920wW = c161247Kj.A00;
            InterfaceC02590Ai A002 = c18920wW.A00(c18920wW.A00, "ig_click_avatar_power_up");
            if (A002.isSampled()) {
                A002.A9K(AbstractC43591JPw.A00(137), Long.valueOf(System.currentTimeMillis()));
                if (((Boolean) c161247Kj.A02.invoke()).booleanValue()) {
                    A00 = "unknown_avatar_power_up";
                } else {
                    A00 = C161247Kj.A00(CBO);
                }
                A002.AAP("item_id", A00);
                A002.Cht();
                return true;
            }
            return true;
        }
        return true;
    }

    public AbstractC161267Kl(C161227Kh c161227Kh, C161287Kn c161287Kn, C7Ko c7Ko, C161237Ki c161237Ki, C161247Kj c161247Kj) {
        this.A00 = c161227Kh;
        this.A03 = c161237Ki;
        this.A04 = c161247Kj;
        this.A01 = c161287Kn;
        this.A02 = c7Ko;
    }

    public static final void A00(C47701L4i c47701L4i, AbstractC161267Kl abstractC161267Kl, C74O c74o, String str, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2, boolean z) {
        Context context;
        long[] jArr;
        int[] iArr;
        interfaceC16820sZ.invoke();
        ImageView imageView = c47701L4i.A06;
        if (imageView != null) {
            imageView.setVisibility(0);
        }
        c74o.A06();
        c74o.A08();
        c74o.A0I = new ME8(interfaceC16820sZ2, abstractC161267Kl, c47701L4i, str, 11);
        if (z && imageView != null && (context = imageView.getContext()) != null) {
            C161237Ki c161237Ki = abstractC161267Kl.A03;
            AnonymousClass541 CBO = abstractC161267Kl.CBO();
            C14360o3.A0B(CBO, 1);
            Object systemService = context.getSystemService("vibrator");
            C14360o3.A0C(systemService, "null cannot be cast to non-null type android.os.Vibrator");
            Vibrator vibrator = (Vibrator) systemService;
            if (c161237Ki.A00) {
                Object systemService2 = context.getSystemService("vibrator");
                C14360o3.A0C(systemService2, "null cannot be cast to non-null type android.os.Vibrator");
                if (((Vibrator) systemService2).hasAmplitudeControl()) {
                    AbstractC46717Kla abstractC46717Kla = AbstractC46717Kla.$redex_init_class;
                    int ordinal = CBO.ordinal();
                    if (ordinal != 6) {
                        if (ordinal != 7) {
                            if (ordinal != 9) {
                                if (ordinal == 8) {
                                    jArr = new long[]{100, 150, 50, 50, 200, 150, 50, 50, 200, 150, 50, 50};
                                    iArr = new int[]{0, 30, 10, 5, 0, 30, 10, 5, 0, 30, 10, 5};
                                }
                            } else {
                                jArr = new long[]{500, 100, 150, 100, 150, 100, 150, 100, 150, 100, 150, 100, 150};
                                iArr = new int[]{0, 30, 0, 30, 0, 30, 0, 30, 0, 30, 0, 15, 0};
                            }
                        } else {
                            jArr = new long[]{500, 200, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50};
                            iArr = new int[]{0, 150, 50, 45, 40, 35, 30, 25, 20, 15, 10, 5};
                        }
                    } else {
                        jArr = new long[]{50, 150, 50, 150, 50, 25, 50, 25, 50, 25, 50};
                        iArr = new int[]{15, 0, 10, 0, 25, 0, 15, 0, 10, 0, 15};
                    }
                    VibrationEffect createWaveform = VibrationEffect.createWaveform(jArr, iArr, -1);
                    C14360o3.A07(createWaveform);
                    vibrator.vibrate(createWaveform);
                    return;
                }
            }
            vibrator.vibrate(50L);
        }
    }

    @Override // X.InterfaceC161277Km
    public final /* synthetic */ boolean CRi(String str) {
        return false;
    }
}
