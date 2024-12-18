package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.igds.components.button.IgdsButton;

/* renamed from: X.Ctd, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C29172Ctd implements InterfaceC69513Al {
    public final /* synthetic */ View A00;
    public final /* synthetic */ C7VL A01;

    public C29172Ctd(View view, C7VL c7vl) {
        this.A01 = c7vl;
        this.A00 = view;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v22, types: [X.2zJ, java.lang.Object] */
    @Override // X.InterfaceC69513Al
    public final void DLu(View view) {
        String str;
        C14360o3.A0B(view, 0);
        C7VL c7vl = this.A01;
        InterfaceC16820sZ interfaceC16820sZ = c7vl.A0D;
        C3I9 c3i9 = (C3I9) interfaceC16820sZ.invoke();
        if (c3i9 != null) {
            c3i9.A9e((InterfaceC60152ox) c7vl.A0C.getValue());
        }
        C3I9 c3i92 = (C3I9) interfaceC16820sZ.invoke();
        if (c3i92 != null) {
            c3i92.Dnr(c7vl.A0B.requireActivity());
        }
        c7vl.A03 = view.findViewById(R.id.ai_suggested_reply_shadow);
        c7vl.A01 = view.findViewById(R.id.ai_suggested_reply_container);
        View findViewById = view.findViewById(R.id.ai_suggested_reply_header);
        c7vl.A00 = findViewById;
        if (findViewById == null) {
            str = "header";
        } else {
            ViewOnClickListenerC28667ClF.A01(findViewById, 48, c7vl);
            IgdsButton igdsButton = (IgdsButton) view.findViewById(R.id.suggested_reply_edit_button);
            c7vl.A08 = igdsButton;
            if (igdsButton == null) {
                str = "edit";
            } else {
                ViewOnClickListenerC28667ClF.A01(igdsButton, 49, c7vl);
                IgdsButton igdsButton2 = (IgdsButton) view.findViewById(R.id.suggested_reply_send_button);
                c7vl.A0A = igdsButton2;
                String str2 = "send";
                if (igdsButton2 != null) {
                    igdsButton2.A02(EnumC99774dy.A03, R.drawable.instagram_direct_filled_16);
                    IgdsButton igdsButton3 = c7vl.A0A;
                    if (igdsButton3 != null) {
                        igdsButton3.setIconPadding(view.getResources().getDimensionPixelSize(R.dimen.abc_button_padding_horizontal_material));
                        IgdsButton igdsButton4 = c7vl.A0A;
                        if (igdsButton4 != null) {
                            ViewOnClickListenerC28667ClF.A01(igdsButton4, 50, c7vl);
                            IgdsButton igdsButton5 = (IgdsButton) view.findViewById(R.id.suggested_reply_refresh_button);
                            c7vl.A09 = igdsButton5;
                            if (igdsButton5 == null) {
                                str = "refresh";
                            } else {
                                ViewOnClickListenerC28667ClF.A01(igdsButton5, 51, c7vl);
                                IgdsButton igdsButton6 = (IgdsButton) view.findViewById(R.id.suggested_reply_cancel_button);
                                c7vl.A07 = igdsButton6;
                                if (igdsButton6 == null) {
                                    str = "cancel";
                                } else {
                                    ViewOnClickListenerC28667ClF.A01(igdsButton6, 52, c7vl);
                                    C66392zG A00 = C66362zD.A00(this.A00.getContext());
                                    A00.A01(new C27066Bwp(((C7VI) c7vl).A00.A00));
                                    A00.A01(new Object());
                                    c7vl.A05 = A00.A00();
                                    RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.suggested_reply_messages);
                                    c7vl.A04 = recyclerView;
                                    if (recyclerView == null) {
                                        str = "messageListRecyclerView";
                                    } else {
                                        C66362zD c66362zD = c7vl.A05;
                                        if (c66362zD == null) {
                                            str2 = "messageListRecyclerViewAdapter";
                                        } else {
                                            recyclerView.setAdapter(c66362zD);
                                            View findViewById2 = view.findViewById(R.id.ai_suggested_reply_settings);
                                            c7vl.A02 = findViewById2;
                                            if (findViewById2 == null) {
                                                str2 = "settings";
                                            } else {
                                                ViewOnClickListenerC28667ClF.A01(findViewById2, 53, c7vl);
                                                return;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                C14360o3.A0F(str2);
                throw C00O.createAndThrow();
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }
}
