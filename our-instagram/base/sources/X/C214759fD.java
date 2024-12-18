package X;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.animation.LinearInterpolator;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.facebook.common.stringformat.StringFormatUtil;
import java.util.List;
import java.util.Map;
import java.util.Random;

/* renamed from: X.9fD, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C214759fD extends AbstractC59962oe {
    public static final List A0f = AbstractC16960so.A1Q(A01(255, 244, 155), A01(255, 240, 107), A01(255, 197, 132), A01(255, 179, 90), A01(C8S8.DEFAULT_SWIPE_ANIMATION_DURATION, 175, 254), A01(246, 137, 255), A01(200, 175, 253), A01(173, 136, 252), A01(145, 96, 251));
    public static final List A0g;
    public static final Map A0h;
    public static final Map A0i;
    public static final Map A0j;
    public static final List A0k;
    public static final Map A0l;
    public static final String __redex_internal_original_name = "EmojiPongFragment";
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public int A04;
    public View A05;
    public View A06;
    public View A07;
    public View A08;
    public FrameLayout A09;
    public ImageView A0A;
    public ImageView A0B;
    public ImageView A0C;
    public TextView A0D;
    public TextView A0E;
    public TextView A0F;
    public TextView A0G;
    public TextView A0H;
    public TextView A0I;
    public TextView A0J;
    public TextView A0K;
    public TextView A0L;
    public TextView A0M;
    public TextView A0N;
    public TextView A0O;
    public TextView A0P;
    public TextView A0Q;
    public TextView A0R;
    public String A0S;
    public boolean A0T;
    public float A0U;
    public final InterfaceC09390do A0V;
    public final InterfaceC09390do A0W;
    public final InterfaceC09390do A0X;
    public final InterfaceC09390do A0Y;
    public final InterfaceC09390do A0Z;
    public final InterfaceC09390do A0a;
    public final InterfaceC09390do A0b;
    public final InterfaceC09390do A0c;
    public final InterfaceC09390do A0d;
    public final InterfaceC09390do A0e;

    public static final void A04(ValueAnimator.AnimatorUpdateListener animatorUpdateListener, ValueAnimator valueAnimator, C214759fD c214759fD) {
        valueAnimator.addUpdateListener(new C44249Jgt(4, animatorUpdateListener, c214759fD));
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return AbstractC43591JPw.A00(1051);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        FragmentActivity activity;
        Window window;
        Context context;
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        View view2 = this.mView;
        if (view2 != null) {
            this.A06 = view2.findViewById(R.id.paddle);
        }
        View view3 = this.mView;
        if (view3 != null) {
            TextView A0e = AbstractC166987dD.A0e(view3, R.id.ball);
            String str = this.A0S;
            if (str != null) {
                A0e.setText(str);
                this.A0E = A0e;
            }
            C14360o3.A0F("emoji");
            throw C00O.createAndThrow();
        }
        View view4 = this.mView;
        if (view4 != null) {
            TextView A0e2 = AbstractC166987dD.A0e(view4, R.id.projectile);
            Map map = A0j;
            String str2 = this.A0S;
            if (str2 != null) {
                A0e2.setText((CharSequence) map.get(str2));
                if (AbstractC167007dF.A1Z(this.A0X)) {
                    A0e2.setText("💗");
                }
                this.A0P = A0e2;
            }
            C14360o3.A0F("emoji");
            throw C00O.createAndThrow();
        }
        View view5 = this.mView;
        if (view5 != null) {
            this.A0D = AbstractC166987dD.A0e(view5, R.id.arrow);
        }
        View view6 = this.mView;
        if (view6 != null && (context = getContext()) != null) {
            TextView A0e3 = AbstractC166987dD.A0e(view6, R.id.current_score);
            A0e3.setTypeface(AbstractC14710oj.A02(context));
            this.A0H = A0e3;
        }
        InterfaceC09390do interfaceC09390do = this.A0W;
        boolean A1Z = AbstractC167007dF.A1Z(interfaceC09390do);
        View view7 = this.mView;
        if (A1Z) {
            if (view7 != null) {
                if (((String[]) this.A0a.getValue()).length == 1) {
                    this.A08 = view7.findViewById(R.id.social_high_score_container);
                    this.A0C = (ImageView) view7.findViewById(R.id.facepile);
                    this.A0Q = AbstractC166987dD.A0e(view7, R.id.social_high_score_left);
                    this.A0R = AbstractC166987dD.A0e(view7, R.id.social_high_score_right);
                    this.A0F = AbstractC166987dD.A0e(view7, R.id.crown_left);
                    this.A0G = AbstractC166987dD.A0e(view7, R.id.crown_right);
                } else {
                    this.A05 = view7.findViewById(R.id.leaderboard_container);
                    this.A0M = AbstractC166987dD.A0e(view7, R.id.leaderboard_high_score);
                    this.A0N = AbstractC166987dD.A0e(view7, R.id.leaderboard_label);
                    this.A0B = (ImageView) view7.findViewById(R.id.leaderboard_icon);
                }
            }
        } else if (view7 != null) {
            TextView A0e4 = AbstractC166987dD.A0e(view7, R.id.high_score);
            A0e4.setText(A02(this));
            this.A0L = A0e4;
        }
        View view8 = this.mView;
        if (view8 != null) {
            TextView A0e5 = AbstractC166987dD.A0e(view8, R.id.explosion);
            String str3 = this.A0S;
            if (str3 != null) {
                A0e5.setText(str3);
                this.A0I = A0e5;
            }
            C14360o3.A0F("emoji");
            throw C00O.createAndThrow();
        }
        View view9 = this.mView;
        if (view9 != null) {
            this.A09 = (FrameLayout) view9.findViewById(R.id.emoji_shower_container);
        }
        View view10 = this.mView;
        if (view10 != null) {
            ImageView imageView = (ImageView) view10.findViewById(R.id.dismiss_button);
            ViewOnClickListenerC23249ASk.A00(imageView, 48, this);
            this.A0A = imageView;
        }
        View view11 = this.mView;
        if (view11 != null) {
            View findViewById = view11.findViewById(R.id.restart_button);
            ViewOnClickListenerC23249ASk.A00(findViewById, 49, this);
            this.A07 = findViewById;
        }
        View view12 = this.mView;
        if (view12 != null) {
            TextView A0e6 = AbstractC166987dD.A0e(view12, R.id.game_over_label);
            A0e6.setTypeface(AbstractC14710oj.A02(A0e6.getContext()));
            this.A0K = A0e6;
        }
        View view13 = this.mView;
        if (view13 != null) {
            TextView A0e7 = AbstractC166987dD.A0e(view13, R.id.final_score);
            A0e7.setTypeface(AbstractC14710oj.A02(A0e7.getContext()));
            this.A0J = A0e7;
        }
        View view14 = this.mView;
        if (view14 != null) {
            TextView A0e8 = AbstractC166987dD.A0e(view14, R.id.new_high_score);
            A0e8.setTypeface(AbstractC14710oj.A02(A0e8.getContext()));
            this.A0O = A0e8;
        }
        View view15 = this.mView;
        if (view15 != null && (activity = getActivity()) != null && (window = activity.getWindow()) != null) {
            window.addFlags(512);
            AbstractC13880nE.A0d(view15, AbstractC56402iY.A01(activity));
            AbstractC13880nE.A0Y(view15, C30D.A00);
            A08(this, true);
        }
        View view16 = this.mView;
        if (view16 != null) {
            view16.setOnTouchListener(new ViewOnTouchListenerC209789Po(this, 7));
        }
        if (AbstractC167007dF.A1Z(interfaceC09390do)) {
            AbstractC52922bZ abstractC52922bZ = (AbstractC52922bZ) this.A0d.getValue();
            Object value = this.A0a.getValue();
            String str4 = (String) this.A0c.getValue();
            AbstractC167007dF.A1K(value, str4);
            C141796aw A00 = AbstractC141776au.A00(abstractC52922bZ);
            MC9 mc9 = new MC9(abstractC52922bZ, value, str4, (InterfaceC23621Ds) null, 35);
            AnonymousClass191 anonymousClass191 = AnonymousClass191.A00;
            AbstractC23641Du.A05(anonymousClass191, mc9, A00);
            Context context2 = getContext();
            if (context2 != null) {
                C07S c07s = C07S.STARTED;
                C07X viewLifecycleOwner = getViewLifecycleOwner();
                AbstractC23641Du.A05(anonymousClass191, new MCM(viewLifecycleOwner, c07s, context2, this, null, 20), C07Y.A00(viewLifecycleOwner));
            }
        }
        view.post(new RunnableC24436AsH(this));
    }

    static {
        Float valueOf = Float.valueOf(1.3f);
        C09530e4 A1L = AbstractC166987dD.A1L("😡", valueOf);
        C09530e4 A1L2 = AbstractC166987dD.A1L("🤬", valueOf);
        Float valueOf2 = Float.valueOf(1.2f);
        C09530e4 A1L3 = AbstractC166987dD.A1L("😤", valueOf2);
        C09530e4 A1L4 = AbstractC166987dD.A1L("😠", valueOf2);
        Float valueOf3 = Float.valueOf(5.0f);
        A0l = AbstractC06930Yk.A06(A1L, A1L2, A1L3, A1L4, AbstractC166987dD.A1L("👹", valueOf3), AbstractC166987dD.A1L("🐢", Float.valueOf(0.8f)));
        A0i = AbstractC06930Yk.A06(AbstractC166987dD.A1L("😡", valueOf3), AbstractC166987dD.A1L("🤬", valueOf3), AbstractC166987dD.A1L("😤", valueOf3), AbstractC166987dD.A1L("😠", valueOf3), AbstractC166987dD.A1L("👹", valueOf3), AbstractC166987dD.A1L("🪃", Float.valueOf(8.0f)));
        C09530e4[] c09530e4Arr = new C09530e4[30];
        System.arraycopy(new C09530e4[]{AbstractC166987dD.A1L("🥚", "🐣"), AbstractC166987dD.A1L("🐣", "🐥"), AbstractC166987dD.A1L("🐥", "🐓"), AbstractC166987dD.A1L("🌱", "🌿"), AbstractC166987dD.A1L("🌿", "🌳"), AbstractC166987dD.A1L("🍇", "🍷"), AbstractC166987dD.A1L("🐛", "🦋"), AbstractC166987dD.A1L("🍏", "🍎"), AbstractC166987dD.A1L("👶", "🧒"), AbstractC166987dD.A1L("🧒", "👦"), AbstractC166987dD.A1L("👦", "👨"), AbstractC166987dD.A1L("🌙", "🌛"), AbstractC166987dD.A1L("🌛", "🌜"), AbstractC166987dD.A1L("🌜", "🌝"), AbstractC166987dD.A1L("🌝", "🌙"), AbstractC166987dD.A1L("🌧️", "⛈️"), AbstractC166987dD.A1L("🌕", "🌖"), AbstractC166987dD.A1L("🌖", "🌗"), AbstractC166987dD.A1L("🌗", "🌘"), AbstractC166987dD.A1L("🌘", "🌑"), AbstractC166987dD.A1L("🌑", "🌒"), AbstractC166987dD.A1L("🌒", "🌓"), AbstractC166987dD.A1L("🌓", "🌔"), AbstractC166987dD.A1L("🌔", "🌕"), AbstractC166987dD.A1L("🥔", "🍟"), AbstractC166987dD.A1L("🐴", "🦄"), AbstractC166987dD.A1L("🌎", "🌍")}, 0, c09530e4Arr, 0, 27);
        System.arraycopy(AbstractC167007dF.A1b("🌾", "🥖", AbstractC166987dD.A1L("🌍", "🌏"), AbstractC166987dD.A1L("🌏", "🌎")), 0, c09530e4Arr, 27, 3);
        A0h = AbstractC06930Yk.A06(c09530e4Arr);
        C09530e4[] c09530e4Arr2 = new C09530e4[89];
        System.arraycopy(new C09530e4[]{AbstractC166987dD.A1L("😅", "💧"), AbstractC166987dD.A1L("🤣", "💧"), AbstractC166987dD.A1L("😢", "💧"), AbstractC166987dD.A1L("😂", "💧"), AbstractC166987dD.A1L("🥲", "💧"), AbstractC166987dD.A1L("😹", "💧"), AbstractC166987dD.A1L("😭", "💦"), new C09530e4("🔥", "🔥"), AbstractC166987dD.A1L("🌪️", "🍃"), AbstractC166987dD.A1L("😍", "❤️"), AbstractC166987dD.A1L("💩", "🪰"), AbstractC166987dD.A1L("🛸", "👽"), AbstractC166987dD.A1L("👑", "💎"), AbstractC166987dD.A1L("🦄", "🌈"), AbstractC166987dD.A1L("🤖", "⚙️"), AbstractC166987dD.A1L("😡", "💥"), AbstractC166987dD.A1L("🥳", "🎉"), AbstractC166987dD.A1L("😴", "💤"), AbstractC166987dD.A1L("🤑", "💸"), AbstractC166987dD.A1L("🥵", "🔥"), AbstractC166987dD.A1L("🥶", "❄️"), AbstractC166987dD.A1L("🤕", "💊"), AbstractC166987dD.A1L("🤒", "🌡️"), AbstractC166987dD.A1L("👹", "🔥"), AbstractC166987dD.A1L("👺", "🔥"), AbstractC166987dD.A1L("🤧", "💨"), AbstractC166987dD.A1L("🥴", "🌀")}, 0, c09530e4Arr2, 0, 27);
        System.arraycopy(new C09530e4[]{AbstractC166987dD.A1L("👽", "🛸"), AbstractC166987dD.A1L("🎃", "🍬"), AbstractC166987dD.A1L("😇", "✨"), AbstractC166987dD.A1L("🤓", "📚"), AbstractC166987dD.A1L("😎", "🕶️"), AbstractC166987dD.A1L("👸", "👑"), AbstractC166987dD.A1L("💐", "🌸"), AbstractC166987dD.A1L("👨\u200d🚀", "🚀"), AbstractC166987dD.A1L("👩\u200d🚀", "🌕"), AbstractC166987dD.A1L("👨\u200d🚒", "🔥"), AbstractC166987dD.A1L("👩\u200d🚒", "🧯"), AbstractC166987dD.A1L("👮", "🚓"), AbstractC166987dD.A1L("🧙", "✨"), AbstractC166987dD.A1L("🧚", "✨"), AbstractC166987dD.A1L("🧛", "🦇"), AbstractC166987dD.A1L("🧜\u200d♀️", "💧"), AbstractC166987dD.A1L("🧜\u200d♂️", "💧"), AbstractC166987dD.A1L("🦸", "⚡"), AbstractC166987dD.A1L("🧝", "🌲"), AbstractC166987dD.A1L("🧞", "💨"), AbstractC166987dD.A1L("🧟", "🧠"), AbstractC166987dD.A1L("🌟", "✨"), AbstractC166987dD.A1L("🎶", "🎵"), AbstractC166987dD.A1L("🐓", "🥚"), AbstractC166987dD.A1L("🐔", "🥚"), new C09530e4("❄️", "❄️"), AbstractC166987dD.A1L("💦", "💧")}, 0, c09530e4Arr2, 27, 27);
        System.arraycopy(new C09530e4[]{AbstractC166987dD.A1L("🚗", "💨"), AbstractC166987dD.A1L("🚀", "🔥"), AbstractC166987dD.A1L("💖", "✨"), AbstractC166987dD.A1L("🍕", "🧀"), AbstractC166987dD.A1L("🚔", "🚨"), AbstractC166987dD.A1L("🚓", "🚨"), AbstractC166987dD.A1L("🧋", "•"), AbstractC166987dD.A1L("☠️", "🦴"), AbstractC166987dD.A1L("💀", "🦴"), AbstractC166987dD.A1L("😵\u200d💫", "🌀"), AbstractC166987dD.A1L("🥸", "👃"), AbstractC166987dD.A1L("🤩", "⭐️"), AbstractC166987dD.A1L("🧠", "💡"), AbstractC166987dD.A1L("👀", "👁"), AbstractC166987dD.A1L("🤳", "📱"), AbstractC166987dD.A1L("👩\u200d❤️\u200d👩", "❤️"), AbstractC166987dD.A1L("💑", "❤️"), AbstractC166987dD.A1L("👨\u200d❤️\u200d👨", "❤️"), AbstractC166987dD.A1L("👩\u200d❤️\u200d👨", "❤️"), AbstractC166987dD.A1L("👩\u200d❤️\u200d💋\u200d👩", "❤️"), AbstractC166987dD.A1L("💏", "❤️"), AbstractC166987dD.A1L("👨\u200d❤️\u200d💋\u200d👨", "❤️"), AbstractC166987dD.A1L("🎩", "🐇"), AbstractC166987dD.A1L("🥷🏻", "✦"), AbstractC166987dD.A1L("👩🏼\u200d🌾", "🥕"), AbstractC166987dD.A1L("🧑🏼\u200d🌾", "🥕"), AbstractC166987dD.A1L("👨🏼\u200d🌾", "🥕")}, 0, c09530e4Arr2, 54, 27);
        System.arraycopy(new C09530e4[]{AbstractC166987dD.A1L("🐝", "🍯"), AbstractC166987dD.A1L("🕷", "🥚"), AbstractC166987dD.A1L("🐉", "龙"), AbstractC166987dD.A1L("🎂", "🍰"), AbstractC166987dD.A1L("🫖", "🍵"), AbstractC166987dD.A1L("🍾", "🥂"), AbstractC166987dD.A1L("🎮", "👾"), AbstractC166987dD.A1L("❤️\u200d🔥", "🔥")}, 0, c09530e4Arr2, 81, 8);
        A0j = AbstractC06930Yk.A06(c09530e4Arr2);
        A0g = AbstractC16960so.A1Q("❤️", "💙", "💚", "💛", "💔", "❤️\u200d🩹", "💜", "🤎", "❤️\u200d🔥", "🤍", "🖤", "🧡", "💖", "💝", "🫀");
        A0k = AbstractC16960so.A1Q("🍷", "🍸", "🥃", "🥛", "🍹", "🫙");
    }

    private final int A00() {
        float f;
        Map map = A0l;
        String str = this.A0S;
        if (str == null) {
            C14360o3.A0F("emoji");
            throw C00O.createAndThrow();
        }
        Number number = (Number) map.get(str);
        if (number != null) {
            f = number.floatValue();
        } else {
            f = 1.0f;
        }
        return (int) ((20.0f * f) + this.A04);
    }

    private final void A03() {
        String str;
        if (AbstractC167007dF.A1Z(this.A0X)) {
            List list = A0g;
            InterfaceC09390do interfaceC09390do = this.A0Z;
            String str2 = (String) list.get(((Random) interfaceC09390do.getValue()).nextInt(list.size()));
            this.A0S = str2;
            TextView textView = this.A0E;
            if (textView == null) {
                str = "ballView";
            } else {
                String str3 = "emoji";
                if (str2 != null) {
                    textView.setText(str2);
                    TextView textView2 = this.A0I;
                    if (textView2 == null) {
                        str = "explosionView";
                    } else {
                        String str4 = this.A0S;
                        if (str4 != null) {
                            textView2.setText(str4);
                            View view = this.mView;
                            if (view != null && ((Random) interfaceC09390do.getValue()).nextFloat() < 0.025f) {
                                TextView textView3 = this.A0D;
                                if (textView3 == null) {
                                    str3 = "arrowView";
                                } else {
                                    textView3.setVisibility(0);
                                    ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(1000L);
                                    C14360o3.A07(duration);
                                    duration.setInterpolator(new LinearInterpolator());
                                    A04(new C44249Jgt(5, view, this), duration, this);
                                    duration.addListener(new LLo(0, new MHL(this, 16), this));
                                    duration.start();
                                    return;
                                }
                            } else {
                                return;
                            }
                        }
                    }
                }
                C14360o3.A0F(str3);
                throw C00O.createAndThrow();
            }
            C14360o3.A0F(str);
            throw C00O.createAndThrow();
        }
    }

    public static void A05(ValueAnimator valueAnimator, C214759fD c214759fD, int i) {
        A04(new ANV(c214759fD, i), valueAnimator, c214759fD);
        valueAnimator.start();
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A0b);
    }

    public C214759fD() {
        MHL mhl = new MHL(this, 27);
        MHL mhl2 = new MHL(this, 23);
        EnumC09460dv enumC09460dv = EnumC09460dv.A02;
        InterfaceC09390do A00 = AbstractC09440dt.A00(enumC09460dv, new MHL(mhl2, 24));
        this.A0d = new C60842q8(new MHL(A00, 25), mhl, new C50169MDw(47, A00, null), new C0YZ(C44476Jli.class));
        this.A0c = AbstractC09440dt.A00(enumC09460dv, new MHL(this, 26));
        this.A0a = AbstractC09440dt.A00(enumC09460dv, new MHL(this, 19));
        this.A02 = 1.0f;
        this.A0U = -1.0f;
        this.A0Y = AbstractC09440dt.A00(enumC09460dv, new MHL(this, 18));
        this.A0Z = AbstractC09440dt.A00(enumC09460dv, C25046B6t.A00);
        this.A0X = AbstractC09440dt.A00(enumC09460dv, new MHL(this, 15));
        this.A0W = AbstractC09440dt.A00(enumC09460dv, new MHL(this, 14));
        this.A0e = AbstractC09440dt.A00(enumC09460dv, C25047B6u.A00);
        this.A0V = AbstractC09440dt.A00(enumC09460dv, C25045B6s.A00);
        this.A0b = AbstractC60492pY.A02(this);
    }

    public static Integer A01(int i, int i2, int i3) {
        return Integer.valueOf(Color.rgb(i, i2, i3));
    }

    public static final String A02(C214759fD c214759fD) {
        String string = c214759fD.getString(2131961738, StringFormatUtil.formatStrLocaleSafe("%03d", Integer.valueOf(((C23031Ai) c214759fD.A0Y.getValue()).A01.getInt(AbstractC43591JPw.A00(954), 0))));
        C14360o3.A07(string);
        return string;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x005e, code lost:
    
        if ((r3 + (r0.getWidth() / 2)) > X.AbstractC166987dD.A07(r4)) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A06(X.C214759fD r12) {
        /*
            Method dump skipped, instructions count: 1226
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C214759fD.A06(X.9fD):void");
    }

    public static final void A07(C214759fD c214759fD) {
        View view;
        Drawable drawable;
        if (c214759fD.getContext() != null && (view = c214759fD.mView) != null) {
            c214759fD.A04 = 0;
            TextView textView = c214759fD.A0H;
            String str = "currentScoreText";
            if (textView != null) {
                textView.setText(String.valueOf(0));
                TextView textView2 = c214759fD.A0H;
                if (textView2 != null) {
                    textView2.setVisibility(0);
                    InterfaceC09390do interfaceC09390do = c214759fD.A0Z;
                    float f = 1.0f;
                    float nextFloat = ((((Random) interfaceC09390do.getValue()).nextFloat() * 0.5f) + 1.0f) - 0.25f;
                    if (!((Random) interfaceC09390do.getValue()).nextBoolean()) {
                        f = -1.0f;
                    }
                    c214759fD.A02 = nextFloat * f;
                    c214759fD.A0U = ((((Random) interfaceC09390do.getValue()).nextFloat() * 0.5f) - 1.0f) - 0.25f;
                    c214759fD.A00 = ((AbstractC166987dD.A07(view) / 2.0f) + ((Random) interfaceC09390do.getValue()).nextInt(10)) - 5.0f;
                    c214759fD.A01 = ((AbstractC166987dD.A08(view) / 2.0f) + ((Random) interfaceC09390do.getValue()).nextInt(10)) - 5.0f;
                    TextView textView3 = c214759fD.A0E;
                    if (textView3 == null) {
                        str = "ballView";
                    } else {
                        textView3.setVisibility(0);
                        View view2 = c214759fD.A06;
                        if (view2 == null) {
                            str = "paddleView";
                        } else {
                            view2.setVisibility(0);
                            View view3 = c214759fD.A07;
                            if (view3 == null) {
                                str = "restartButton";
                            } else {
                                view3.setVisibility(8);
                                TextView textView4 = c214759fD.A0J;
                                if (textView4 == null) {
                                    str = "finalScoreText";
                                } else {
                                    textView4.setVisibility(8);
                                    TextView textView5 = c214759fD.A0O;
                                    if (textView5 == null) {
                                        str = "newHighScoreText";
                                    } else {
                                        textView5.setVisibility(8);
                                        FrameLayout frameLayout = c214759fD.A09;
                                        if (frameLayout == null) {
                                            str = "emojiShowerContainer";
                                        } else {
                                            frameLayout.removeAllViews();
                                            int A0H = AbstractC166987dD.A0H(A0f.get(0));
                                            View view4 = c214759fD.mView;
                                            if (view4 != null) {
                                                view4.setBackgroundColor(A0H);
                                            }
                                            ImageView imageView = c214759fD.A0A;
                                            if (imageView == null) {
                                                str = "dismissButton";
                                            } else {
                                                Drawable drawable2 = imageView.getDrawable();
                                                InterfaceC09390do interfaceC09390do2 = c214759fD.A0V;
                                                drawable2.setTint(AbstractC167027dH.A01(interfaceC09390do2));
                                                TextView textView6 = c214759fD.A0L;
                                                if (textView6 != null) {
                                                    textView6.setTextColor(AbstractC167027dH.A01(interfaceC09390do2));
                                                }
                                                TextView textView7 = c214759fD.A0Q;
                                                if (textView7 != null) {
                                                    textView7.setTextColor(AbstractC167027dH.A01(interfaceC09390do2));
                                                }
                                                TextView textView8 = c214759fD.A0R;
                                                if (textView8 != null) {
                                                    textView8.setTextColor(AbstractC167027dH.A01(interfaceC09390do2));
                                                }
                                                ImageView imageView2 = c214759fD.A0B;
                                                if (imageView2 != null && (drawable = imageView2.getDrawable()) != null) {
                                                    drawable.setTint(AbstractC167027dH.A01(interfaceC09390do2));
                                                }
                                                TextView textView9 = c214759fD.A0M;
                                                if (textView9 != null) {
                                                    textView9.setVisibility(0);
                                                }
                                                TextView textView10 = c214759fD.A0N;
                                                if (textView10 != null) {
                                                    textView10.setVisibility(8);
                                                }
                                                A08(c214759fD, true);
                                                View view5 = c214759fD.mView;
                                                if (view5 != null) {
                                                    ValueAnimator duration = ValueAnimator.ofFloat(AbstractC166987dD.A07(view5) / 4.0f, AbstractC166987dD.A07(view5) / 2.0f).setDuration(500L);
                                                    C14360o3.A07(duration);
                                                    duration.setInterpolator(new OvershootInterpolator());
                                                    A05(duration, c214759fD, 11);
                                                }
                                                C2UY.A01.A05(100L);
                                                view.postDelayed(new RunnableC24439AsK(c214759fD), 16L);
                                                return;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            C14360o3.A0F(str);
            throw C00O.createAndThrow();
        }
    }

    public static final void A08(C214759fD c214759fD, boolean z) {
        Window window;
        FragmentActivity activity = c214759fD.getActivity();
        if (activity != null && (window = activity.getWindow()) != null) {
            AbstractC011704f abstractC011704f = new C011904h(window.getDecorView(), window).A00;
            abstractC011704f.A05(z);
            abstractC011704f.A04(z);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        String string;
        int A02 = C0f9.A02(-625233850);
        super.onCreate(bundle);
        Bundle bundle2 = this.mArguments;
        String str = "❤️";
        if (bundle2 != null && (string = bundle2.getString(AbstractC111324zv.A00(2255), "❤️")) != null) {
            str = string;
        }
        this.A0S = str;
        C0f9.A09(1106930902, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-1465271670);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.fragment_emoji_pong, viewGroup, false);
        C0f9.A09(-1592191998, A02);
        return inflate;
    }
}
