package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.TextView;
import com.facebook.R;
import com.google.common.collect.ImmutableList;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.direct.view.ReshareTogglePickerView;
import com.instagram.creation.capture.quickcapture.ephemeralmediatoggle.EphemeralMediaToggleView;

/* renamed from: X.8EJ, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8EJ implements InterfaceC1821886c {
    public float A00;
    public ViewGroup A01;
    public C8DO A02;
    public C48252LXb A03;
    public C199028r5 A04;
    public C9K8 A05;
    public boolean A06;
    public int A07;
    public boolean A08;
    public final Context A09;
    public final ImmutableList A0A;
    public final UserSession A0B;
    public final int A0C;

    public C8EJ(Context context, C9BW c9bw, UserSession userSession, C9K8 c9k8, int i) {
        C14360o3.A0B(context, 1);
        C14360o3.A0B(userSession, 2);
        this.A09 = context;
        this.A0B = userSession;
        this.A05 = c9k8;
        this.A0C = i;
        ImmutableList copyOf = ImmutableList.copyOf((Object[]) c9bw.A00);
        C14360o3.A07(copyOf);
        this.A0A = copyOf;
        this.A07 = i;
        C8DO c8do = (C8DO) c9bw.A01;
        if (!copyOf.contains(c8do)) {
            Object obj = copyOf.get(0);
            C14360o3.A07(obj);
            c8do = (C8DO) obj;
        }
        this.A02 = c8do;
    }

    @Override // X.InterfaceC1821886c
    public final /* synthetic */ void onPause() {
    }

    @Override // X.InterfaceC1821886c
    public final /* synthetic */ void onResume() {
    }

    public final void A00(boolean z) {
        EphemeralMediaToggleView ephemeralMediaToggleView;
        InterfaceC09390do interfaceC09390do;
        InterfaceC56392iX interfaceC56392iX;
        View view;
        C9K8 c9k8;
        InterfaceC09390do interfaceC09390do2;
        InterfaceC56392iX interfaceC56392iX2;
        View view2;
        C9K8 c9k82;
        InterfaceC09390do interfaceC09390do3;
        InterfaceC56392iX interfaceC56392iX3;
        View view3;
        ViewGroup viewGroup;
        InterfaceC09390do interfaceC09390do4;
        ReshareTogglePickerView reshareTogglePickerView;
        InterfaceC09390do interfaceC09390do5;
        InterfaceC56392iX interfaceC56392iX4;
        View view4;
        C9K8 c9k83;
        View view5;
        InterfaceC09390do interfaceC09390do6;
        ReshareTogglePickerView reshareTogglePickerView2;
        InterfaceC09390do interfaceC09390do7;
        InterfaceC56392iX interfaceC56392iX5;
        View view6;
        C9K8 c9k84;
        View view7;
        if (!this.A08 || z) {
            this.A08 = true;
            int i = this.A07;
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i != 5) {
                            if (i != 7) {
                                AbstractC12120kG.A07("DirectViewModesPickerController", "unidentified view mode entry point", null);
                                return;
                            }
                            return;
                        }
                        C9K8 c9k85 = this.A05;
                        if (c9k85 == null || (interfaceC09390do6 = c9k85.A0B) == null) {
                            return;
                        }
                        InterfaceC56392iX interfaceC56392iX6 = (InterfaceC56392iX) interfaceC09390do6.getValue();
                        if (interfaceC56392iX6 != null && (view7 = interfaceC56392iX6.getView()) != null) {
                            view7.setVisibility(0);
                        }
                        C9K8 c9k86 = this.A05;
                        if (c9k86 != null && (interfaceC09390do7 = c9k86.A0B) != null && (interfaceC56392iX5 = (InterfaceC56392iX) interfaceC09390do7.getValue()) != null && (view6 = interfaceC56392iX5.getView()) != null && (c9k84 = this.A05) != null) {
                            c9k84.A09 = (ReshareTogglePickerView) view6.requireViewById(R.id.mode_picker);
                        }
                        C9K8 c9k87 = this.A05;
                        if (c9k87 != null && (reshareTogglePickerView2 = c9k87.A09) != null) {
                            reshareTogglePickerView2.setVisibility(8);
                        }
                        C9K8 c9k88 = this.A05;
                        if (c9k88 == null) {
                            return;
                        }
                        View requireViewById = c9k88.A0D.requireViewById(R.id.recipient_view_mode_picker_toggle_gradient_dim);
                        C14360o3.A07(requireViewById);
                        requireViewById.setVisibility(0);
                        requireViewById.getLayoutParams().height = this.A09.getResources().getDimensionPixelSize(R.dimen.audition_flow_footer_text_button_min_width);
                        return;
                    }
                    C9K8 c9k89 = this.A05;
                    if (c9k89 == null || (interfaceC09390do4 = c9k89.A0B) == null) {
                        return;
                    }
                    InterfaceC56392iX interfaceC56392iX7 = (InterfaceC56392iX) interfaceC09390do4.getValue();
                    if (interfaceC56392iX7 != null && (view5 = interfaceC56392iX7.getView()) != null) {
                        view5.setVisibility(0);
                    }
                    C9K8 c9k810 = this.A05;
                    if (c9k810 != null && (interfaceC09390do5 = c9k810.A0B) != null && (interfaceC56392iX4 = (InterfaceC56392iX) interfaceC09390do5.getValue()) != null && (view4 = interfaceC56392iX4.getView()) != null && (c9k83 = this.A05) != null) {
                        c9k83.A09 = (ReshareTogglePickerView) view4.requireViewById(R.id.mode_picker);
                    }
                    C9K8 c9k811 = this.A05;
                    if (c9k811 != null) {
                        View requireViewById2 = c9k811.A0D.requireViewById(R.id.recipient_view_mode_picker_toggle_gradient_dim);
                        C14360o3.A07(requireViewById2);
                        requireViewById2.setVisibility(0);
                        requireViewById2.getLayoutParams().height = this.A09.getResources().getDimensionPixelSize(R.dimen.audition_flow_footer_text_button_min_width);
                    }
                    C9K8 c9k812 = this.A05;
                    if (c9k812 == null || (reshareTogglePickerView = c9k812.A09) == null) {
                        return;
                    }
                    this.A03 = new C48252LXb(this.A09, this.A0B, reshareTogglePickerView, C05F.A00);
                    return;
                }
                C9K8 c9k813 = this.A05;
                if (c9k813 != null) {
                    TextView textView = null;
                    InterfaceC09390do interfaceC09390do8 = c9k813.A0B;
                    if (interfaceC09390do8 != null) {
                        c9k813.A06 = (ViewGroup) ((InterfaceC56392iX) interfaceC09390do8.getValue()).getView().requireViewById(R.id.mode_picker);
                        C9K8 c9k814 = this.A05;
                        if (c9k814 != null && (viewGroup = c9k814.A06) != null) {
                            textView = (TextView) viewGroup.findViewById(R.id.static_picker);
                        }
                        C9K8 c9k815 = this.A05;
                        if (textView == null) {
                            if (c9k815 != null && (interfaceC09390do3 = c9k815.A0B) != null && (interfaceC56392iX3 = (InterfaceC56392iX) interfaceC09390do3.getValue()) != null && (view3 = interfaceC56392iX3.getView()) != null) {
                                view3.setVisibility(8);
                            }
                            ViewGroup viewGroup2 = this.A01;
                            if (viewGroup2 == null && (c9k82 = this.A05) != null) {
                                View inflate = ((ViewStub) c9k82.A0D.requireViewById(R.id.recipient_view_mode_one_day_expiry_stub)).inflate();
                                C14360o3.A0C(inflate, "null cannot be cast to non-null type android.view.ViewGroup");
                                viewGroup2 = (ViewGroup) inflate;
                                this.A01 = viewGroup2;
                            }
                            if (viewGroup2 == null) {
                                return;
                            }
                            viewGroup2.setVisibility(0);
                            viewGroup2.requireViewById(R.id.static_picker);
                            return;
                        }
                        if (c9k815 != null && (interfaceC09390do2 = c9k815.A0B) != null && (interfaceC56392iX2 = (InterfaceC56392iX) interfaceC09390do2.getValue()) != null && (view2 = interfaceC56392iX2.getView()) != null) {
                            view2.setVisibility(8);
                        }
                        textView.setText(2131971593);
                        return;
                    }
                    throw new IllegalStateException("Required value was null.");
                }
                throw new IllegalStateException("Required value was null.");
            }
            ViewGroup viewGroup3 = this.A01;
            if (viewGroup3 != null) {
                viewGroup3.setVisibility(8);
            }
            C9K8 c9k816 = this.A05;
            if (c9k816 != null) {
                InterfaceC09390do interfaceC09390do9 = c9k816.A0B;
                if (interfaceC09390do9 != null) {
                    ((InterfaceC56392iX) interfaceC09390do9.getValue()).getView().setVisibility(0);
                    C9K8 c9k817 = this.A05;
                    if (c9k817 != null && (interfaceC09390do = c9k817.A0B) != null && (interfaceC56392iX = (InterfaceC56392iX) interfaceC09390do.getValue()) != null && (view = interfaceC56392iX.getView()) != null && (c9k8 = this.A05) != null) {
                        c9k8.A0A = (EphemeralMediaToggleView) view.requireViewById(R.id.mode_picker);
                    }
                    C9K8 c9k818 = this.A05;
                    if (c9k818 != null) {
                        View requireViewById3 = c9k818.A0D.requireViewById(R.id.recipient_view_mode_picker_toggle_gradient_dim);
                        C14360o3.A07(requireViewById3);
                        requireViewById3.setVisibility(0);
                        requireViewById3.getLayoutParams().height = this.A09.getResources().getDimensionPixelSize(R.dimen.audition_flow_footer_text_button_min_width);
                    }
                    C9K8 c9k819 = this.A05;
                    if (c9k819 == null || (ephemeralMediaToggleView = c9k819.A0A) == null) {
                        return;
                    }
                    this.A04 = new C199028r5(this.A09, this.A0A, this.A0B, this.A02, ephemeralMediaToggleView);
                    return;
                }
                throw new IllegalStateException("Required value was null.");
            }
            throw new IllegalStateException("Required value was null.");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0040, code lost:
    
        if (r4.A0L == false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0029, code lost:
    
        if (r6 != false) goto L7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A01(boolean r6) {
        /*
            r5 = this;
            X.9K8 r4 = r5.A05
            if (r4 == 0) goto L29
            android.view.View r1 = r4.A0D
            android.content.Context r3 = r1.getContext()
            r0 = 2131431760(0x7f0b1150, float:1.8485258E38)
            android.view.View r2 = r1.requireViewById(r0)
            X.C14360o3.A07(r2)
            android.widget.TextView r2 = (android.widget.TextView) r2
            r0 = 2131968535(0x7f134217, float:1.9573967E38)
            java.lang.String r1 = r3.getString(r0)
            X.C14360o3.A07(r1)
            if (r6 == 0) goto L2c
            r2.setText(r1)
        L25:
            r0 = 3
        L26:
            r5.A07 = r0
            return
        L29:
            if (r6 == 0) goto L4c
            goto L25
        L2c:
            java.lang.CharSequence r0 = r2.getText()
            boolean r0 = X.C14360o3.A0K(r0, r1)
            if (r0 == 0) goto L4c
            int r1 = r4.A00
            r0 = 2
            if (r1 != r0) goto L42
            boolean r1 = r4.A0L
            r0 = 2131960434(0x7f132272, float:1.9557537E38)
            if (r1 != 0) goto L45
        L42:
            r0 = 2131960425(0x7f132269, float:1.9557518E38)
        L45:
            java.lang.String r0 = r3.getString(r0)
            r2.setText(r0)
        L4c:
            int r0 = r5.A0C
            goto L26
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8EJ.A01(boolean):void");
    }
}
