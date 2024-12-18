package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.Alz, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C24063Alz implements InterfaceC57997Pnh {
    public final /* synthetic */ C8JI A00;

    public C24063Alz(C8JI c8ji) {
        this.A00 = c8ji;
    }

    @Override // X.InterfaceC57997Pnh
    public final void Dd6(final C54845OMq c54845OMq) {
        int i;
        boolean z;
        final C8JN c8jn;
        C8JN c8jn2;
        C8JN c8jn3;
        C14360o3.A0B(c54845OMq, 0);
        C8JI c8ji = this.A00;
        C55U c55u = c8ji.A00;
        if (c55u instanceof C81S) {
            i = 1;
        } else if (c55u instanceof C81V) {
            i = 4;
        } else {
            i = 0;
            if (c55u instanceof C208509Kk) {
                i = 3;
            }
        }
        int i2 = c54845OMq.A00;
        if (i2 != i && i2 == 3 && (c8jn3 = (C8JN) c8ji.A0G) != null) {
            UserSession userSession = c8jn3.A08;
            Context context = c8jn3.A07;
            if (AbstractC195888lY.A01(context.getApplicationContext(), userSession)) {
                C37101o8.A00(AbstractC195888lY.A00()).A00(context, userSession, new C24066Am5(c8jn3, 1), "GlassesStoryViewListenerEXIT_STORY_DESINATION_WITH_SUP_CALLBACK");
            }
        }
        c54845OMq.A02(i);
        if (c8ji.A00 instanceof C208509Kk) {
            final C1810981l c1810981l = c8ji.A0A;
            AbstractC55106ObM A00 = C8JI.A00(c8ji);
            boolean z2 = false;
            if (A00 != null) {
                z = A00.A0H();
            } else {
                z = false;
            }
            c1810981l.A03 = z;
            AbstractC55106ObM A002 = C8JI.A00(c8ji);
            if (A002 != null && A002.A0H()) {
                z2 = true;
            }
            C8JL c8jl = null;
            if (z2 && (c8jn2 = (C8JN) c8ji.A0G) != null) {
                c8jn2.A05();
                c8jn2.A04();
            }
            InterfaceC25209BDh interfaceC25209BDh = c8ji.A01;
            if (interfaceC25209BDh != null) {
                c8jl = interfaceC25209BDh.BNn();
            }
            if ((c8jl instanceof C8JN) && (c8jn = (C8JN) c8jl) != null) {
                c54845OMq.A04(new AbstractC54847OMw() { // from class: X.9eG
                    @Override // X.AbstractC54847OMw
                    public final void A0C(AbstractC53435NkO abstractC53435NkO) {
                        AbstractC55106ObM A003;
                        if (abstractC53435NkO instanceof C214149eE) {
                            C8JN.A02(c54845OMq, c8jn, true);
                            return;
                        }
                        if (abstractC53435NkO instanceof C214159eF) {
                            C8JN.A02(c54845OMq, c8jn, false);
                            return;
                        }
                        if (!(abstractC53435NkO instanceof N1H)) {
                            return;
                        }
                        C8JN c8jn4 = c8jn;
                        if (c8jn4.A09.A0Y() || (A003 = C8JN.A00(c8jn4)) == null || !A003.A0J()) {
                            return;
                        }
                        A003.A02();
                        c8jn4.DYJ();
                        A003.A0D(A003.A00);
                    }

                    @Override // X.AbstractC54847OMw
                    public final void A01() {
                        C8JN c8jn4 = c8jn;
                        c8jn4.A05();
                        c8jn4.A04();
                        c1810981l.A03 = true;
                        long currentTimeMillis = System.currentTimeMillis();
                        if (currentTimeMillis - c8jn4.A00 > 1800000) {
                            c8jn4.A00 = currentTimeMillis;
                            c54845OMq.A0B.E4W();
                        }
                    }

                    @Override // X.AbstractC54847OMw
                    public final void A04() {
                        C8JN c8jn4 = c8jn;
                        AbstractC55106ObM A003 = C8JN.A00(c8jn4);
                        if (A003 != null && A003.A0J()) {
                            if (c8jn4.A09.A0Y()) {
                                C176567tE.A00(new RunnableC24366Ar9(c8jn4));
                            } else {
                                A003.A07();
                                c8jn4.DYJ();
                            }
                        }
                        c1810981l.A03 = false;
                    }

                    @Override // X.AbstractC54847OMw
                    public final void A07() {
                        C8JN c8jn4 = c8jn;
                        UserSession userSession2 = c8jn4.A08;
                        Context context2 = c8jn4.A07;
                        if (AbstractC195888lY.A01(context2.getApplicationContext(), userSession2)) {
                            C37101o8.A00(AbstractC195888lY.A00()).A00(context2, userSession2, new PH0(c8jn4, 0), "GlassesStoryViewListener_STREAM_STARTING_CALLBACK_ID");
                        }
                    }

                    @Override // X.AbstractC54847OMw
                    public final void A08() {
                        c8jn.A06(false);
                    }
                }, "sup:SupDelegate_STORIES_DEST_WITH_SUP_CB_ID");
                AbstractC55198Oe5 abstractC55198Oe5 = c54845OMq.A09;
                if (abstractC55198Oe5 != null) {
                    abstractC55198Oe5.A0A.put("sup:SupDelegate_STORIES_DEST_WITH_SUP_CB_ID", new OTI(c54845OMq, c8jn));
                    return;
                }
                return;
            }
            return;
        }
        c54845OMq.A06("sup:SupDelegate_STORIES_DEST_WITH_SUP_CB_ID");
        AbstractC55198Oe5 abstractC55198Oe52 = c54845OMq.A09;
        if (abstractC55198Oe52 == null) {
            return;
        }
        abstractC55198Oe52.A0A.remove("sup:SupDelegate_STORIES_DEST_WITH_SUP_CB_ID");
    }
}
