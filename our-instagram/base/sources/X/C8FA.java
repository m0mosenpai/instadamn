package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.facebook.R;
import com.google.common.collect.ImmutableList;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.UpcomingEvent;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* renamed from: X.8FA, reason: invalid class name */
/* loaded from: classes4.dex */
public abstract class C8FA {
    public boolean A00;
    public final C5GJ A01;
    public final C183688Ct A02;
    public final C8FC A03;
    public final Map A04;

    public /* synthetic */ C8FA(C183688Ct c183688Ct, C8D0 c8d0, Integer num, int i, boolean z, boolean z2) {
        boolean z3 = z2;
        boolean z4 = z;
        C8D0 c8d02 = (i & 1) != 0 ? AbstractC22784A3c.A00 : c8d0;
        float f = (i & 2) != 0 ? 0.25f : 0.0f;
        float f2 = (i & 4) != 0 ? 1.5f : 0.0f;
        z4 = (i & 8) != 0 ? false : z4;
        num = (i & 32) != 0 ? null : num;
        this.A03 = new C8FC(c8d02, (C8FD) null, (C89G) null, C05F.A01, (Integer) null, (Integer) null, (Object) null, (String) null, (List) null, f, f2, -1.0f, -1.0f, -1.0f, num != null ? num.intValue() : 0, true, false, true, z4, (i & 64) != 0 ? false : z3, false, false, true, true, true, true, true, false, false);
        this.A02 = c183688Ct;
        this.A04 = new LinkedHashMap();
        this.A01 = C5GJ.ASSET_PICKER;
    }

    public final C5GJ A02() {
        if (this instanceof C218799lp) {
            return ((C218799lp) this).A00;
        }
        if (this instanceof C218809lq) {
            return ((C218809lq) this).A00;
        }
        return this.A01;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v13, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v18, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.util.AbstractCollection, java.util.ArrayList] */
    public final Map A03() {
        Object obj;
        C148276lx A06;
        String str;
        Object obj2;
        InterfaceC133125ze interfaceC133125ze;
        String C5K;
        String str2;
        InterfaceC133125ze interfaceC133125ze2;
        EnumC150226pU enumC150226pU;
        String str3;
        if (this instanceof C218709lg) {
            obj = new C210459Sk(((C218709lg) this).A00);
            str = "share_platform_sticker_id";
        } else {
            if (this instanceof C218799lp) {
                return ((C218799lp) this).A01;
            }
            if (this instanceof C218919m1) {
                return ((C218919m1) this).A02;
            }
            if (this instanceof C218929m2) {
                return ((C218929m2) this).A04;
            }
            if (this instanceof C218979m7) {
                return ((C218979m7) this).A01;
            }
            if (this instanceof C218969m6) {
                return ((C218969m6) this).A01;
            }
            if (this instanceof C218959m5) {
                return ((C218959m5) this).A00;
            }
            if (this instanceof C218949m4) {
                return ((C218949m4) this).A0B;
            }
            if (this instanceof C8G2) {
                return ((C8G2) this).A01;
            }
            if (this instanceof C218789lo) {
                return ((C218789lo) this).A00;
            }
            if (this instanceof C218899lz) {
                return ((C218899lz) this).A00;
            }
            if (this instanceof C218939m3) {
                C218939m3 c218939m3 = (C218939m3) this;
                obj = c218939m3.A00;
                if (obj == null) {
                    C14360o3.A0F("profileStickerDrawable");
                    throw C00O.createAndThrow();
                }
                int intValue = c218939m3.A01.A04.intValue();
                if (intValue != 0) {
                    if (intValue != 1) {
                        if (intValue == 2) {
                            str = "ai_agent_profile_sticker";
                        } else {
                            throw new RuntimeException();
                        }
                    } else {
                        str = "profile_sticker";
                    }
                } else {
                    str = "share_professional";
                }
            } else {
                if (this instanceof C218699lf) {
                    return ((C218699lf) this).A00;
                }
                if (this instanceof C218779ln) {
                    obj = ((C218779ln) this).A00;
                    Object obj3 = obj;
                    if (obj instanceof C194808jg) {
                        obj3 = ((C194808jg) obj3).A04();
                    }
                    C14360o3.A0A(obj3);
                    if (obj3 instanceof AbstractC202558xZ) {
                        C148276lx c148276lx = C148276lx.A0a;
                        enumC150226pU = EnumC150226pU.A1K;
                        str3 = AbstractC111324zv.A00(5143);
                    } else if (obj3 instanceof BEb) {
                        C148276lx c148276lx2 = C148276lx.A0a;
                        C148286ly c148286ly = new C148286ly();
                        c148286ly.A0S = "question_music_response_reshare_sticker_id";
                        C148286ly c148286ly2 = new C148286ly();
                        c148286ly2.A0S = "question_music_response_reshare_large_sticker_id";
                        A06 = new C148276lx(EnumC150226pU.A1K, "question_music_response_reshare_sticker_id", AbstractC16960so.A1Q(c148286ly, c148286ly2));
                    } else if (obj3 instanceof C216269hj) {
                        C148276lx c148276lx3 = C148276lx.A0a;
                        enumC150226pU = EnumC150226pU.A1K;
                        str3 = "question_media_response_reshare_sticker_id";
                    } else {
                        throw new IllegalStateException("responseStickerDrawable contains an unknown sticker type");
                    }
                    A06 = AbstractC148296lz.A06(enumC150226pU, str3);
                } else {
                    if (this instanceof C218769lm) {
                        return ((C218769lm) this).A00;
                    }
                    if (this instanceof C218839lt) {
                        obj = ((C218839lt) this).A00;
                        A06 = C148276lx.A1B;
                    } else if (this instanceof C218829ls) {
                        obj = ((C218829ls) this).A00;
                        A06 = C148276lx.A1A;
                    } else if (this instanceof C218889ly) {
                        C218889ly c218889ly = (C218889ly) this;
                        Context context = c218889ly.A00;
                        C24024AlG c24024AlG = new C24024AlG(c218889ly.A02, null, EnumC138556Pl.A0D, -1);
                        UserSession userSession = c218889ly.A01;
                        String str4 = c218889ly.A03;
                        C150286pc c150286pc = ((C8FA) c218889ly).A02.A1h;
                        if (c150286pc != null) {
                            c150286pc.get();
                        }
                        obj = AMH.A01(context, userSession, c24024AlG, str4);
                        str = AbstractC111324zv.A00(1118);
                    } else if (this instanceof C218909m0) {
                        C218909m0 c218909m0 = (C218909m0) this;
                        Context context2 = c218909m0.A00;
                        User user = c218909m0.A03;
                        String upperCase = user.getUsername().toUpperCase(Locale.ROOT);
                        C14360o3.A07(upperCase);
                        C217889kL c217889kL = new C217889kL(c218909m0.A01, user, AnonymousClass001.A0D(upperCase, '@'), context2.getResources().getDimensionPixelSize(R.dimen.before_and_after_caption_font_size), AbstractC13890nF.A01(context2));
                        UserSession userSession2 = c218909m0.A02;
                        String str5 = c218909m0.A04;
                        C150286pc c150286pc2 = ((C8FA) c218909m0).A02.A1h;
                        if (c150286pc2 != null) {
                            c150286pc2.get();
                        }
                        obj = AMH.A01(context2, userSession2, c217889kL, str5);
                        str = "";
                        if (obj instanceof C194808jg) {
                            ImmutableList copyOf = ImmutableList.copyOf((Collection) ((C194808jg) obj).A08);
                            C14360o3.A07(copyOf);
                            obj2 = new ArrayList(AbstractC06950Ym.A1E(copyOf, 10));
                            Iterator<E> it = copyOf.iterator();
                            while (it.hasNext()) {
                                Object obj4 = (Drawable) it.next();
                                if (!(obj4 instanceof InterfaceC133125ze) || (interfaceC133125ze2 = (InterfaceC133125ze) obj4) == null || (str2 = interfaceC133125ze2.C5K()) == null) {
                                    str2 = "";
                                }
                                obj2.add(str2);
                            }
                            return AbstractC16850sd.A0M(new C09530e4(obj, obj2));
                        }
                        if ((obj instanceof InterfaceC133125ze) && (interfaceC133125ze = (InterfaceC133125ze) obj) != null && (C5K = interfaceC133125ze.C5K()) != null) {
                            str = C5K;
                        }
                    } else if (this instanceof C218819lr) {
                        C218819lr c218819lr = (C218819lr) this;
                        Context context3 = c218819lr.A00;
                        UpcomingEvent upcomingEvent = c218819lr.A02;
                        Integer num = C05F.A00;
                        obj = new C130205uQ(context3, c218819lr.A01, upcomingEvent, num, num);
                        A06 = C148276lx.A1e;
                    } else {
                        if (this instanceof C218879lx) {
                            C218879lx c218879lx = (C218879lx) this;
                            Context context4 = c218879lx.A00;
                            UserSession userSession3 = c218879lx.A02;
                            C50679MYx c50679MYx = c218879lx.A01;
                            obj = ADS.A00(context4, userSession3, c50679MYx.A01, c50679MYx.A00, AbstractC13880nE.A0A(context4));
                            obj2 = c218879lx.A03;
                        } else {
                            if (this instanceof C218759ll) {
                                return ((C218759ll) this).A00;
                            }
                            if (this instanceof C218869lw) {
                                C218869lw c218869lw = (C218869lw) this;
                                Context context5 = c218869lw.A00;
                                UserSession userSession4 = c218869lw.A01;
                                C217879kK c217879kK = c218869lw.A02;
                                obj = C9NK.A01(context5, userSession4, c217879kK.A02, c217879kK.A00, c217879kK.A01);
                                obj2 = c218869lw.A03;
                            } else if (this instanceof C218859lv) {
                                C218859lv c218859lv = (C218859lv) this;
                                obj = AbstractC22745A1p.A00(c218859lv.A00, c218859lv.A01, c218859lv.A02, c218859lv.A03);
                                str = "group_mention_sticker_bundle_id";
                            } else if (this instanceof C218689le) {
                                obj = ((C218689le) this).A00;
                                C148276lx c148276lx4 = C148276lx.A0a;
                                A06 = AbstractC148296lz.A06(EnumC150226pU.A0b, AbstractC111324zv.A00(4493));
                            } else {
                                if (this instanceof C218749lk) {
                                    return ((C218749lk) this).A00;
                                }
                                if (this instanceof C218739lj) {
                                    return ((C218739lj) this).A00;
                                }
                                if (this instanceof C218729li) {
                                    return ((C218729li) this).A00;
                                }
                                if (this instanceof C218809lq) {
                                    return ((C218809lq) this).A01;
                                }
                                if (this instanceof C218849lu) {
                                    return ((C218849lu) this).A00;
                                }
                                return ((C218719lh) this).A01;
                            }
                        }
                        return AbstractC16850sd.A0M(new C09530e4(obj, obj2));
                    }
                }
                obj2 = A06.A01();
                return AbstractC16850sd.A0M(new C09530e4(obj, obj2));
            }
        }
        obj2 = Collections.singletonList(str);
        C14360o3.A07(obj2);
        return AbstractC16850sd.A0M(new C09530e4(obj, obj2));
    }

    public final void A04() {
        if (this instanceof C218929m2) {
            C218929m2 c218929m2 = (C218929m2) this;
            if (!c218929m2.A00) {
                c218929m2.A00 = true;
                int i = (int) (c218929m2.A01 * 0.73d);
                C218929m2.A01(c218929m2.A03, c218929m2, i);
                C218929m2.A01(c218929m2.A02, c218929m2, i + ((int) (r0.getIntrinsicHeight() * 1.4d)));
                return;
            }
            return;
        }
        if (this instanceof C218949m4) {
            C218949m4 c218949m4 = (C218949m4) this;
            if (c218949m4.A04) {
                return;
            }
            ((C8FA) c218949m4).A02.A0h(c218949m4.A02, c218949m4.A02(), c218949m4.A03, null, C148276lx.A1W.A01());
            C218949m4.A01(c218949m4, c218949m4.A09);
            C218949m4.A01(c218949m4, C218949m4.A0C.A03(c218949m4.A05, c218949m4.A06, c218949m4.A07, c218949m4.A08.A00));
            C218949m4.A01(c218949m4, c218949m4.A0A);
            c218949m4.A04 = true;
            return;
        }
        if (this instanceof C218939m3) {
            C218939m3 c218939m3 = (C218939m3) this;
            if (!c218939m3.A04) {
                c218939m3.A02.invoke();
            }
            c218939m3.A03 = true;
            return;
        }
        if (this instanceof C218719lh) {
            C218719lh c218719lh = (C218719lh) this;
            if (c218719lh.A00.A09 != null) {
                return;
            }
            c218719lh.A05();
            return;
        }
        A05();
    }

    public final void A05() {
        String str;
        if (!this.A00) {
            for (Map.Entry entry : A03().entrySet()) {
                Drawable drawable = (Drawable) entry.getKey();
                List list = (List) entry.getValue();
                C183688Ct c183688Ct = this.A02;
                C8FC c8fc = (C8FC) this.A04.get(drawable);
                if (c8fc == null) {
                    c8fc = this.A03;
                }
                C5GJ A02 = A02();
                if (this instanceof C218909m0) {
                    str = "mention_sticker";
                } else {
                    str = null;
                }
                c183688Ct.A0h(drawable, A02, c8fc, str, list);
            }
            this.A00 = true;
        }
    }

    public static Map A00(C148276lx c148276lx, Object obj) {
        return AbstractC16850sd.A0M(new C09530e4(obj, c148276lx.A01()));
    }
}
