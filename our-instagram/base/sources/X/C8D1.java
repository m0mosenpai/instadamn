package X;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.view.View;
import android.view.ViewStub;
import android.widget.FrameLayout;
import com.facebook.R;
import com.instagram.common.gallery.Medium;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider;
import com.instagram.ui.widget.filmstriptimeline.FilmstripTimelineView;
import java.io.File;

/* renamed from: X.8D1, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8D1 implements InterfaceC16620sF {
    public final /* synthetic */ C183688Ct A00;

    public C8D1(C183688Ct c183688Ct) {
        this.A00 = c183688Ct;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        String str = (String) obj2;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        C183688Ct c183688Ct = this.A00;
        if (booleanValue) {
            Activity activity = c183688Ct.A0o;
            Medium A00 = C8IU.A00(activity, android.net.Uri.fromFile(new File(str)), 3);
            if (A00 != null) {
                UserSession userSession = c183688Ct.A0w;
                C2AH c2ah = new C2AH() { // from class: X.9gt
                    @Override // X.C2AH
                    public final /* bridge */ /* synthetic */ void onSuccess(Object obj3) {
                        View requireViewById;
                        C195868lW c195868lW = (C195868lW) obj3;
                        C183688Ct c183688Ct2 = C8D1.this.A00;
                        C23805AgG c23805AgG = (C23805AgG) c183688Ct2.A1Z.get();
                        InterfaceC1810081c interfaceC1810081c = c23805AgG.A0F;
                        InterfaceC1810781j interfaceC1810781j = c23805AgG.A0H;
                        C1809981b c1809981b = (C1809981b) interfaceC1810081c;
                        C14360o3.A0B(interfaceC1810781j, 0);
                        if (!c1809981b.A02.A02.contains(interfaceC1810781j)) {
                            interfaceC1810081c.A85(interfaceC1810781j);
                        }
                        InterfaceC1810781j interfaceC1810781j2 = c23805AgG.A0G;
                        C14360o3.A0B(interfaceC1810781j2, 0);
                        if (!c1809981b.A01.A02.contains(interfaceC1810781j2)) {
                            interfaceC1810081c.A82(interfaceC1810781j2);
                        }
                        ViewStub viewStub = c23805AgG.A08;
                        if (viewStub != null && viewStub.getParent() != null) {
                            requireViewById = viewStub.inflate();
                            C14360o3.A0C(requireViewById, "null cannot be cast to non-null type com.instagram.ui.widget.filmstriptimeline.FilmstripTimelineView");
                        } else {
                            requireViewById = c23805AgG.A07.requireViewById(R.id.boomerang_trimmer);
                            C14360o3.A0A(requireViewById);
                        }
                        FilmstripTimelineView filmstripTimelineView = (FilmstripTimelineView) requireViewById;
                        c23805AgG.A05 = filmstripTimelineView;
                        if (filmstripTimelineView != null) {
                            filmstripTimelineView.setShowSeekbar(false);
                            FilmstripTimelineView filmstripTimelineView2 = c23805AgG.A05;
                            if (filmstripTimelineView2 != null) {
                                filmstripTimelineView2.A00 = c23805AgG.A0D;
                                TargetViewSizeProvider targetViewSizeProvider = c23805AgG.A0B;
                                C14360o3.A0B(targetViewSizeProvider, 0);
                                if (targetViewSizeProvider.CV5()) {
                                    AbstractC13880nE.A0q(filmstripTimelineView2, new RunnableC24617AvD(filmstripTimelineView2, targetViewSizeProvider));
                                }
                                Context context = c23805AgG.A06;
                                int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.album_preview_add_item_margin);
                                int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(R.dimen.account_group_management_title_text_horizontal_padding);
                                FilmstripTimelineView filmstripTimelineView3 = c23805AgG.A05;
                                if (filmstripTimelineView3 != null) {
                                    filmstripTimelineView3.A02(c23805AgG.A0I, dimensionPixelSize, dimensionPixelSize2);
                                    c23805AgG.A04 = (FrameLayout) c23805AgG.A07.requireViewById(R.id.gl_frame_preview_container);
                                    c195868lW.A1I = true;
                                    c195868lW.A13 = true;
                                    c195868lW.A1H = false;
                                    c183688Ct2.A1N.E4u(new C187718To(c195868lW));
                                    return;
                                }
                            }
                        }
                        C14360o3.A0F("trimmerTimelineView");
                        throw C00O.createAndThrow();
                    }
                };
                C14360o3.A0B(activity, 0);
                C14360o3.A0B(userSession, 2);
                C121275eQ c121275eQ = new C121275eQ(new CallableC209459Oe(activity, A00, userSession, true), 458);
                c121275eQ.A00 = c2ah;
                C1GJ.A03(c121275eQ);
            }
        } else {
            Dialog dialog = (Dialog) c183688Ct.A20.getValue();
            if (dialog.isShowing()) {
                dialog.dismiss();
            }
        }
        return C0eB.A00;
    }
}
