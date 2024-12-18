package X;

import android.content.Context;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.api.schemas.DemarcatorActionType;
import com.instagram.api.schemas.DemarcatorStyleEnum;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.igds.components.button.IgdsButton;

/* renamed from: X.2zd, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C66612zd extends AbstractC65632xz {
    public InterfaceC63342uH A00;

    @Override // X.AbstractC65632xz, X.InterfaceC65642y0
    public final String getBinderGroupName() {
        return "EndOfFeedUnitDemarcator";
    }

    @Override // X.AbstractC65632xz, X.InterfaceC65642y0
    public final int getIdentifier(int i, Object obj, Object obj2) {
        C14360o3.A0B(obj, 1);
        String str = ((C3CL) obj).A04.A0B;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    @Override // X.InterfaceC65642y0
    public final int getViewTypeCount() {
        return 6;
    }

    @Override // X.InterfaceC65642y0
    public final void bindView(int i, View view, Object obj, Object obj2) {
        C110434yF c110434yF;
        C110434yF c110434yF2;
        String str;
        final Integer num;
        String str2;
        View.OnClickListener viewOnClickListenerC41886IhO;
        View.OnClickListener viewOnClickListenerC41886IhO2;
        String str3;
        String str4;
        int A03 = C0f9.A03(-1804632387);
        C14360o3.A0B(view, 1);
        C14360o3.A0B(obj, 2);
        C14360o3.A0B(obj2, 3);
        if (view.getTag() instanceof AbstractC110714yj) {
            Object tag = view.getTag();
            C14360o3.A0C(tag, "null cannot be cast to non-null type com.instagram.mainfeed.unconnectedcontent.EndOfFeedUnitDemarcatorHolder");
            AbstractC110714yj abstractC110714yj = (AbstractC110714yj) tag;
            final C3CL c3cl = (C3CL) obj;
            final C110464yI c110464yI = (C110464yI) obj2;
            final InterfaceC63342uH interfaceC63342uH = this.A00;
            C14360o3.A0B(abstractC110714yj, 0);
            C14360o3.A0B(c3cl, 1);
            C14360o3.A0B(c110464yI, 2);
            DemarcatorStyleEnum demarcatorStyleEnum = DemarcatorStyleEnum.A06;
            DemarcatorStyleEnum demarcatorStyleEnum2 = c3cl.A03;
            if (demarcatorStyleEnum == demarcatorStyleEnum2) {
                c110464yI.A00();
            }
            abstractC110714yj.A01(c110464yI);
            abstractC110714yj.A04(c3cl.A0C, c3cl.A0B);
            String str5 = "";
            View.OnClickListener onClickListener = null;
            abstractC110714yj.A02("", null);
            abstractC110714yj.A03("", null);
            DemarcatorActionType demarcatorActionType = c3cl.A01;
            DemarcatorActionType demarcatorActionType2 = c3cl.A02;
            C110424yE c110424yE = c3cl.A06;
            if (c110424yE != null) {
                c110434yF = c110424yE.A00(C3ZF.A04.A00);
                if (c110434yF == null) {
                    c110434yF = c110424yE.A00(C3ZF.A06.A00);
                }
            } else {
                c110434yF = c3cl.A05;
            }
            if (abstractC110714yj instanceof C110734yl) {
                num = C05F.A0C;
            } else if (c3cl.A07 == C1XV.A0E) {
                num = C05F.A00;
            } else {
                String str6 = C3ZF.A04.A00;
                if (c110424yE != null) {
                    c110434yF2 = c110424yE.A00(str6);
                    if (c110434yF2 == null) {
                        c110434yF2 = c110424yE.A00(C3ZF.A06.A00);
                    }
                } else {
                    c110434yF2 = c3cl.A05;
                }
                if (c110434yF2 != null) {
                    str = c110434yF2.A03;
                } else {
                    str = null;
                }
                if (C14360o3.A0K(str6, str)) {
                    num = C05F.A0N;
                } else {
                    num = C05F.A01;
                }
            }
            c110464yI.A02 = AbstractC110744ym.A00(num);
            if (c110434yF != null && (((str3 = c110434yF.A04) != null && str3.length() != 0 && ((!c110434yF.A06.isEmpty()) || ((str4 = c110434yF.A00) != null && str4.length() != 0))) || demarcatorStyleEnum == demarcatorStyleEnum2)) {
                final C110434yF c110434yF3 = c110434yF;
                abstractC110714yj.A03(str3, new View.OnClickListener() { // from class: X.4yn
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        int A05 = C0f9.A05(1596945272);
                        InterfaceC63342uH interfaceC63342uH2 = interfaceC63342uH;
                        if (interfaceC63342uH2 != null) {
                            interfaceC63342uH2.E2r(c3cl, c110434yF3, c110464yI, num);
                        }
                        C0f9.A0C(-1053277145, A05);
                    }
                });
            } else if (demarcatorActionType != null) {
                if (demarcatorActionType2 != null) {
                    str5 = c3cl.A09;
                }
                View.OnClickListener onClickListener2 = null;
                if (interfaceC63342uH != null) {
                    int ordinal = demarcatorActionType.ordinal();
                    if (ordinal != 1) {
                        if (ordinal == 2) {
                            viewOnClickListenerC41886IhO2 = new ViewOnClickListenerC41887IhP(interfaceC63342uH);
                        }
                    } else {
                        viewOnClickListenerC41886IhO2 = new ViewOnClickListenerC41886IhO(interfaceC63342uH);
                    }
                    onClickListener2 = viewOnClickListenerC41886IhO2;
                }
                abstractC110714yj.A02(str5, onClickListener2);
                if (demarcatorActionType2 != null) {
                    str2 = c3cl.A0A;
                    demarcatorActionType = demarcatorActionType2;
                } else {
                    str2 = c3cl.A09;
                }
                if (interfaceC63342uH != null) {
                    int ordinal2 = demarcatorActionType.ordinal();
                    if (ordinal2 != 1) {
                        if (ordinal2 == 2) {
                            viewOnClickListenerC41886IhO = new ViewOnClickListenerC41887IhP(interfaceC63342uH);
                        }
                    } else {
                        viewOnClickListenerC41886IhO = new ViewOnClickListenerC41886IhO(interfaceC63342uH);
                    }
                    onClickListener = viewOnClickListenerC41886IhO;
                }
                abstractC110714yj.A03(str2, onClickListener);
            }
            abstractC110714yj.A00(c3cl);
        }
        C0f9.A0A(-790506219, A03);
    }

    @Override // X.InterfaceC65642y0
    public final /* bridge */ /* synthetic */ void buildRowViewTypes(AnonymousClass306 anonymousClass306, Object obj, Object obj2) {
        int i;
        C3CL c3cl = (C3CL) obj;
        C110464yI c110464yI = (C110464yI) obj2;
        C14360o3.A0B(anonymousClass306, 0);
        C14360o3.A0B(c3cl, 1);
        C14360o3.A0B(c110464yI, 2);
        if (c110464yI.getPosition() == 0 && c3cl.A07 == C1XV.A0E) {
            i = 2;
        } else {
            DemarcatorStyleEnum demarcatorStyleEnum = DemarcatorStyleEnum.A0B;
            DemarcatorStyleEnum demarcatorStyleEnum2 = c3cl.A03;
            if (demarcatorStyleEnum == demarcatorStyleEnum2) {
                i = 1;
            } else if (DemarcatorStyleEnum.A05 == demarcatorStyleEnum2) {
                i = 3;
            } else if (DemarcatorStyleEnum.A06 == demarcatorStyleEnum2) {
                i = 4;
            } else {
                i = 0;
                if (DemarcatorStyleEnum.A04 == demarcatorStyleEnum2) {
                    i = 5;
                }
            }
        }
        anonymousClass306.A7b(i, c3cl, c110464yI);
    }

    @Override // X.InterfaceC65642y0
    public final View createView(int i, ViewGroup viewGroup) {
        View inflate;
        Object c39163HLr;
        int A03 = C0f9.A03(1801048863);
        C14360o3.A0B(viewGroup, 1);
        Context context = viewGroup.getContext();
        C14360o3.A07(context);
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        LayoutInflater from = LayoutInflater.from(context);
                        if (i != 5) {
                            inflate = from.inflate(R.layout.layout_end_of_feed_demarcator_large, viewGroup, false);
                            KeyEvent.Callback requireViewById = inflate.requireViewById(R.id.demarcator_icon);
                            C14360o3.A0C(requireViewById, "null cannot be cast to non-null type com.instagram.feed.ui.views.ProgressListener");
                            View requireViewById2 = inflate.requireViewById(R.id.title);
                            C14360o3.A07(requireViewById2);
                            View requireViewById3 = inflate.requireViewById(R.id.subtitle);
                            C14360o3.A07(requireViewById3);
                            View requireViewById4 = inflate.requireViewById(R.id.footer_space);
                            C14360o3.A07(requireViewById4);
                            View requireViewById5 = inflate.requireViewById(R.id.button);
                            C14360o3.A07(requireViewById5);
                            View requireViewById6 = inflate.requireViewById(R.id.link);
                            C14360o3.A07(requireViewById6);
                            c39163HLr = new C39164HLs(requireViewById4, (IgTextView) requireViewById2, (IgTextView) requireViewById3, (InterfaceC110654yd) requireViewById, (IgdsButton) requireViewById5, (IgdsButton) requireViewById6);
                        } else {
                            inflate = from.inflate(R.layout.layout_end_of_feed_demarcator_discover_more_v1, viewGroup, false);
                            View requireViewById7 = inflate.requireViewById(R.id.title);
                            C14360o3.A07(requireViewById7);
                            View requireViewById8 = inflate.requireViewById(R.id.subtitle);
                            C14360o3.A07(requireViewById8);
                            c39163HLr = new C39162HLq((IgTextView) requireViewById7, (IgTextView) requireViewById8);
                        }
                    } else {
                        inflate = LayoutInflater.from(context).inflate(R.layout.layout_end_of_feed_demarcator_top_of_feed, viewGroup, false);
                        KeyEvent.Callback requireViewById9 = inflate.requireViewById(R.id.demarcator_icon);
                        C14360o3.A0C(requireViewById9, "null cannot be cast to non-null type com.instagram.feed.ui.views.ProgressListener");
                        View requireViewById10 = inflate.requireViewById(R.id.subtitle);
                        C14360o3.A07(requireViewById10);
                        View requireViewById11 = inflate.requireViewById(R.id.title);
                        C14360o3.A07(requireViewById11);
                        View requireViewById12 = inflate.requireViewById(R.id.link);
                        C14360o3.A07(requireViewById12);
                        c39163HLr = new C110704yi((IgTextView) requireViewById10, (IgTextView) requireViewById11, (InterfaceC110654yd) requireViewById9, (IgdsButton) requireViewById12);
                    }
                } else {
                    inflate = new View(context);
                    inflate.setTag(new Object());
                    C0f9.A0A(1683598501, A03);
                    return inflate;
                }
            } else {
                inflate = LayoutInflater.from(context).inflate(R.layout.layout_end_of_feed_demarcator_bar, viewGroup, false);
                View requireViewById13 = inflate.requireViewById(R.id.demarcator_bar_container);
                C14360o3.A07(requireViewById13);
                View requireViewById14 = inflate.requireViewById(R.id.demarcator_icon);
                C14360o3.A07(requireViewById14);
                View requireViewById15 = inflate.requireViewById(R.id.title);
                C14360o3.A07(requireViewById15);
                View requireViewById16 = inflate.requireViewById(R.id.link);
                C14360o3.A07(requireViewById16);
                c39163HLr = new C110734yl(inflate, requireViewById13, (IgTextView) requireViewById15, (IgImageView) requireViewById14, (IgImageView) requireViewById16);
            }
        } else {
            inflate = LayoutInflater.from(context).inflate(R.layout.layout_end_of_feed_demarcator_small, viewGroup, false);
            KeyEvent.Callback requireViewById17 = inflate.requireViewById(R.id.demarcator_icon);
            C14360o3.A0C(requireViewById17, "null cannot be cast to non-null type com.instagram.feed.ui.views.ProgressListener");
            View requireViewById18 = inflate.requireViewById(R.id.title);
            C14360o3.A07(requireViewById18);
            View requireViewById19 = inflate.requireViewById(R.id.subtitle);
            C14360o3.A07(requireViewById19);
            View requireViewById20 = inflate.requireViewById(R.id.button);
            C14360o3.A07(requireViewById20);
            View requireViewById21 = inflate.requireViewById(R.id.link);
            C14360o3.A07(requireViewById21);
            c39163HLr = new C39163HLr((IgTextView) requireViewById18, (IgTextView) requireViewById19, (InterfaceC110654yd) requireViewById17, (IgdsButton) requireViewById20, (IgdsButton) requireViewById21);
        }
        inflate.setTag(c39163HLr);
        C0f9.A0A(1683598501, A03);
        return inflate;
    }

    @Override // X.AbstractC65632xz, X.InterfaceC65642y0
    public final View getView(int i, View view, ViewGroup viewGroup, Object obj, Object obj2) {
        int A03 = C0f9.A03(972146114);
        C14360o3.A0B(viewGroup, 2);
        C14360o3.A0B(obj, 3);
        C14360o3.A0B(obj2, 4);
        if (view == null) {
            view = createView(i, viewGroup);
        }
        bindView(i, view, obj, obj2);
        C0f9.A0A(1664974292, A03);
        return view;
    }
}
