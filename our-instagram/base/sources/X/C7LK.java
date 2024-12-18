package X;

import android.app.Dialog;
import android.view.View;
import android.widget.EditText;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.7LK, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7LK {
    public View A00;
    public EditText A01;
    public final RecyclerView A02;
    public final InterfaceC56392iX A03;
    public final InterfaceC09390do A04;
    public final /* synthetic */ C7ZK A05;

    public C7LK(RecyclerView recyclerView, InterfaceC56392iX interfaceC56392iX, final C7ZK c7zk) {
        this.A05 = c7zk;
        this.A02 = recyclerView;
        this.A03 = interfaceC56392iX;
        this.A04 = C1XM.A00(new C9ED(c7zk, 29));
        interfaceC56392iX.EZv(new InterfaceC69513Al() { // from class: X.7LL
            @Override // X.InterfaceC69513Al
            public final void DLu(View view) {
                Integer num;
                Float f;
                C14360o3.A0B(view, 0);
                final C7LK c7lk = C7LK.this;
                View requireViewById = view.requireViewById(R.id.thread_title_change_container);
                c7lk.A00 = requireViewById;
                if (requireViewById != null && (f = c7lk.A05.A03) != null) {
                    requireViewById.setAlpha(f.floatValue());
                }
                View view2 = c7lk.A00;
                if (view2 != null) {
                    view2.setTranslationZ(1.0f);
                    EditText editText = (EditText) view.requireViewById(R.id.new_thread_title);
                    c7lk.A01 = editText;
                    if (editText != null && (num = c7lk.A05.A04) != null) {
                        editText.setBackgroundColor(num.intValue());
                    }
                    final C7ZK c7zk2 = c7zk;
                    UserSession userSession = c7zk2.A09;
                    C06090Tz c06090Tz = C06090Tz.A05;
                    if (C18U.A06(c06090Tz, userSession, 36317195482960753L)) {
                        EditText editText2 = c7lk.A01;
                        if (editText2 != null) {
                            editText2.setHint(2131960719);
                        } else {
                            throw new IllegalStateException("Required value was null.");
                        }
                    }
                    EditText editText3 = c7lk.A01;
                    if (editText3 != null) {
                        editText3.setOnEditorActionListener(c7zk2);
                        View requireViewById2 = view.requireViewById(R.id.cancel_change_title);
                        C14360o3.A07(requireViewById2);
                        if (C18U.A06(c06090Tz, userSession, 36317195482960753L)) {
                            requireViewById2.setContentDescription(c7zk2.A06.requireContext().getString(2131960716));
                        }
                        C0fQ.A00(new View.OnClickListener() { // from class: X.7LM
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view3) {
                                int A05 = C0f9.A05(-2028772642);
                                C7LK.this.A00();
                                C7ZK c7zk3 = c7zk2;
                                C23031Ai A00 = AbstractC23021Ah.A00(c7zk3.A09);
                                String valueOf = String.valueOf(c7zk3.A02);
                                C14360o3.A0B(valueOf, 0);
                                InterfaceC19610xo ARD = A00.A01.ARD();
                                ARD.E7K("has_seen_thread_title_change_banner_thread_id", valueOf);
                                ARD.apply();
                                C0f9.A0C(1370267366, A05);
                            }
                        }, requireViewById2);
                        c7zk2.A00 = new InterfaceC41501vz() { // from class: X.7LN
                            @Override // X.InterfaceC41501vz
                            public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
                                int A03 = C0f9.A03(1427238027);
                                C7MH c7mh = (C7MH) obj;
                                int A032 = C0f9.A03(-1354223548);
                                C14360o3.A0B(c7mh, 0);
                                int intValue = c7mh.A01.intValue();
                                if (intValue != 0) {
                                    if (intValue != 1) {
                                        if (intValue != 2) {
                                            ((Dialog) C7LK.this.A04.getValue()).dismiss();
                                        }
                                    } else {
                                        C7LK c7lk2 = C7LK.this;
                                        c7lk2.A00();
                                        c7lk2.A02.A0n(0);
                                    }
                                } else {
                                    C0fJ.A00((Dialog) C7LK.this.A04.getValue());
                                }
                                C0f9.A0A(-2132811208, A032);
                                C0f9.A0A(-1514985605, A03);
                            }
                        };
                        return;
                    }
                    throw new IllegalStateException("Required value was null.");
                }
                throw new IllegalStateException("Required value was null.");
            }
        });
        if (!C18U.A06(C06090Tz.A05, c7zk.A09, 36328143355002093L)) {
            interfaceC56392iX.getView();
        }
    }

    public final void A00() {
        InterfaceC56392iX interfaceC56392iX = this.A03;
        if (interfaceC56392iX.CWW()) {
            interfaceC56392iX.setVisibility(8);
            View view = this.A00;
            if (view != null) {
                view.setVisibility(8);
            }
        }
    }
}
