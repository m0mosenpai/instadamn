package X;

import android.animation.Animator;
import android.app.Dialog;
import android.view.TextureView;
import android.view.View;
import android.widget.FrameLayout;
import com.instagram.ui.widget.filmstriptimeline.FilmstripTimelineView;
import java.io.File;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.9PZ, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9PZ implements InterfaceC1810781j {
    public final int A00;
    public final Object A01;

    public C9PZ(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.InterfaceC1810781j
    public final /* bridge */ /* synthetic */ void DoV(Object obj, Object obj2, Object obj3) {
        String str;
        switch (this.A00) {
            case 0:
                EnumC1810181d enumC1810181d = (EnumC1810181d) obj2;
                if (obj == EnumC1810181d.A0z) {
                    C23805AgG.A00((C23805AgG) this.A01);
                }
                if (enumC1810181d == null) {
                    return;
                }
                int ordinal = enumC1810181d.ordinal();
                if (ordinal != 7) {
                    if (ordinal != 11) {
                        return;
                    }
                    C23805AgG.A00((C23805AgG) this.A01);
                    return;
                }
                C23805AgG c23805AgG = (C23805AgG) this.A01;
                InterfaceC09390do interfaceC09390do = c23805AgG.A0J;
                ((C218279kz) interfaceC09390do.getValue()).A02(c23805AgG.A0L);
                C8J9 c8j9 = (C8J9) interfaceC09390do.getValue();
                c8j9.A01.A0A(c8j9, true);
                W37 w37 = c23805AgG.A09;
                EnumC185018Iq enumC185018Iq = c23805AgG.A0K;
                C14360o3.A0B(enumC185018Iq, 0);
                C22952A9w c22952A9w = (C22952A9w) w37.A04.get(enumC185018Iq);
                if (c22952A9w != null) {
                    int i = c22952A9w.A02;
                    if (i == 0) {
                        i = 40;
                    }
                    float f = 20.0f / i;
                    FilmstripTimelineView filmstripTimelineView = c23805AgG.A05;
                    str = "trimmerTimelineView";
                    if (filmstripTimelineView != null) {
                        filmstripTimelineView.setTrimmerMinimumRange(Math.max(0.0f, Math.min(f, 1.0f)));
                        FilmstripTimelineView filmstripTimelineView2 = c23805AgG.A05;
                        if (filmstripTimelineView2 != null) {
                            AbstractC167007dF.A0y(filmstripTimelineView2, false);
                            FilmstripTimelineView filmstripTimelineView3 = c23805AgG.A05;
                            if (filmstripTimelineView3 != null) {
                                AbstractC13880nE.A0u(filmstripTimelineView3, new U7L(4, c22952A9w, c23805AgG));
                                FilmstripTimelineView filmstripTimelineView4 = c23805AgG.A05;
                                if (filmstripTimelineView4 != null) {
                                    if (filmstripTimelineView4.getParent() instanceof View) {
                                        FilmstripTimelineView filmstripTimelineView5 = c23805AgG.A05;
                                        if (filmstripTimelineView5 != null) {
                                            Object parent = filmstripTimelineView5.getParent();
                                            C14360o3.A0C(parent, AbstractC111324zv.A00(2));
                                            AbstractC13880nE.A0n(filmstripTimelineView5, (View) parent);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                c23805AgG.A0E.DWb(c23805AgG);
                return;
            case 1:
                if (obj != EnumC1810381f.A02) {
                    return;
                }
                C23805AgG c23805AgG2 = (C23805AgG) this.A01;
                TextureView textureView = c23805AgG2.A03;
                str = "trimmerPreviewViewHolder";
                if (textureView != null) {
                    FrameLayout frameLayout = c23805AgG2.A04;
                    if (frameLayout != null) {
                        frameLayout.removeView(textureView);
                        c23805AgG2.A03 = null;
                    }
                }
                c23805AgG2.A01 = 0;
                c23805AgG2.A00 = 0;
                FrameLayout frameLayout2 = c23805AgG2.A04;
                if (frameLayout2 != null) {
                    frameLayout2.removeAllViews();
                    c23805AgG2.A03 = null;
                    FilmstripTimelineView filmstripTimelineView6 = c23805AgG2.A05;
                    str = "trimmerTimelineView";
                    if (filmstripTimelineView6 != null) {
                        C8RB c8rb = filmstripTimelineView6.A0B;
                        BDJ bdj = c8rb.A09;
                        if (bdj != null) {
                            bdj.reset();
                            c8rb.A09 = null;
                        }
                        FilmstripTimelineView filmstripTimelineView7 = c23805AgG2.A05;
                        if (filmstripTimelineView7 != null) {
                            filmstripTimelineView7.A00 = null;
                            EnumC185018Iq enumC185018Iq2 = EnumC185018Iq.A08;
                            c23805AgG2.A0L = enumC185018Iq2;
                            W37 w372 = c23805AgG2.A09;
                            Map map = w372.A04;
                            Iterator A15 = AbstractC166997dE.A15(map);
                            while (A15.hasNext()) {
                                C22952A9w c22952A9w2 = (C22952A9w) ((Map.Entry) A15.next()).getValue();
                                C22952A9w.A00(c22952A9w2.A04);
                                C22952A9w.A00(c22952A9w2.A05);
                            }
                            map.clear();
                            File file = w372.A01;
                            if (file != null) {
                                AbstractC13530mf.A09(file.getPath());
                            }
                            w372.A09 = enumC185018Iq2;
                            W37.A00(new X32(w372, 28));
                            ((C8J9) c23805AgG2.A0J.getValue()).CMH(true);
                            InterfaceC1810081c interfaceC1810081c = c23805AgG2.A0F;
                            InterfaceC1810781j interfaceC1810781j = c23805AgG2.A0G;
                            C1809981b c1809981b = (C1809981b) interfaceC1810081c;
                            C14360o3.A0B(interfaceC1810781j, 0);
                            c1809981b.A01.A02.remove(interfaceC1810781j);
                            InterfaceC1810781j interfaceC1810781j2 = c23805AgG2.A0H;
                            C14360o3.A0B(interfaceC1810781j2, 0);
                            c1809981b.A02.A02.remove(interfaceC1810781j2);
                            return;
                        }
                    }
                }
                break;
            case 2:
                EnumC1810181d enumC1810181d2 = EnumC1810181d.A10;
                if (obj == enumC1810181d2) {
                    if (obj3 instanceof C8UR) {
                        C23790Ag1 c23790Ag1 = (C23790Ag1) this.A01;
                        C0fJ.A00((Dialog) c23790Ag1.A0F.getValue());
                        C23790Ag1.A00(c23790Ag1);
                    }
                    C23790Ag1 c23790Ag12 = (C23790Ag1) this.A01;
                    AbstractC166997dE.A1L(c23790Ag12.A07.A01(), true);
                    ((C8J9) c23790Ag12.A0E.getValue()).CMH(true);
                }
                if (obj2 != enumC1810181d2) {
                    return;
                }
                C23790Ag1 c23790Ag13 = (C23790Ag1) this.A01;
                View A01 = c23790Ag13.A07.A01();
                C14360o3.A07(A01);
                AbstractC167007dF.A0y(A01, true);
                C8J9 c8j92 = (C8J9) c23790Ag13.A0E.getValue();
                c8j92.A01.A0A(c8j92, true);
                return;
            case 3:
                if (obj != EnumC1810381f.A02) {
                    return;
                }
                UH0 uh0 = ((C23790Ag1) this.A01).A0C;
                if (uh0.getItemCount() <= 0) {
                    return;
                }
                uh0.A05.clear();
                uh0.notifyDataSetChanged();
                return;
            default:
                if (obj == EnumC1810181d.A18 && obj2 == EnumC1810181d.A11) {
                    C9R2 c9r2 = (C9R2) this.A01;
                    C9R5 c9r5 = c9r2.A08;
                    InterfaceC09390do interfaceC09390do2 = c9r5.A08;
                    ((Animator) interfaceC09390do2.getValue()).removeAllListeners();
                    ((Animator) interfaceC09390do2.getValue()).addListener(new AN5(c9r5, 0));
                    ((Animator) interfaceC09390do2.getValue()).cancel();
                    C9R3 c9r3 = c9r2.A09;
                    ((C185458Kn) c9r3.A02.getValue()).A02.removeCallbacksAndMessages(null);
                    AbstractC167007dF.A0L(c9r3.A03).setVisibility(8);
                    C9R2.A02(c9r2, true);
                    return;
                }
                return;
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }
}
