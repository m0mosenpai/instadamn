package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.DxP, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31768DxP extends BaseAdapter {
    public View A00;
    public final Context A05;
    public final InterfaceC11380iw A06;
    public final UserSession A07;
    public final ENJ A08;
    public final InterfaceC37297Gby A09;
    public final C31538DtO A0A;
    public final List A04 = AbstractC166987dD.A1E();
    public boolean A02 = false;
    public boolean A03 = false;
    public List A01 = AbstractC166987dD.A1E();

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final int getItemViewType(int i) {
        int i2 = 3;
        if (i == 0) {
            return 3;
        }
        if (i == 1) {
            return 4;
        }
        if (i == 2) {
            return 5;
        }
        for (FQK fqk : this.A04) {
            if (i >= i2) {
                int i3 = fqk.A01;
                if (i < i3 + i2) {
                    int i4 = i - i2;
                    if (i4 == 0) {
                        return 0;
                    }
                    if (i4 == i3 - 1) {
                        if (fqk.A00 < fqk.A05.size() || fqk.A02 != null) {
                            return 2;
                        }
                        return 1;
                    }
                    return 1;
                }
            }
            i2 += fqk.A01;
        }
        return -1;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final int getViewTypeCount() {
        return 6;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        if (this.A03) {
            return 4;
        }
        int i = 3;
        if (this.A02) {
            return this.A01.size() + 3;
        }
        Iterator it = this.A04.iterator();
        while (it.hasNext()) {
            i += ((FQK) it.next()).A01;
        }
        return i;
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        int i2 = 3;
        for (FQK fqk : this.A04) {
            if (i >= i2) {
                int i3 = fqk.A01;
                if (i < i3 + i2) {
                    int i4 = i - i2;
                    if (i4 == 0) {
                        return fqk.A04;
                    }
                    if (i4 == i3 - 1 && (fqk.A00 < fqk.A05.size() || fqk.A02 != null)) {
                        return null;
                    }
                    return fqk.A05.get(i4 - 1);
                }
            }
            i2 += fqk.A01;
        }
        return null;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        View A00;
        C31579Du7 c31579Du7;
        UserSession userSession;
        Object item;
        String A0a;
        LayoutInflater from;
        int i2;
        Context context = viewGroup.getContext();
        if (context == null) {
            return view;
        }
        if (this.A03 && i >= 3) {
            View A002 = FC2.A00(LayoutInflater.from(context), viewGroup);
            C33603EtF c33603EtF = (C33603EtF) AbstractC31172DnG.A0x(A002);
            String string = context.getResources().getString(2131968660);
            C14360o3.A0B(c33603EtF, 0);
            c33603EtF.A01.setText(string);
            return A002;
        }
        if (this.A02 && i >= 3) {
            A00 = AbstractC31578Du6.A00(context, viewGroup);
            c31579Du7 = (C31579Du7) AbstractC31172DnG.A0x(A00);
            userSession = this.A07;
            item = this.A01.get(i - 3);
        } else {
            int itemViewType = getItemViewType(i);
            if (itemViewType != 0) {
                if (itemViewType != 1) {
                    if (itemViewType != 2) {
                        if (itemViewType != 3) {
                            if (itemViewType != 4) {
                                if (itemViewType != 5) {
                                    return view;
                                }
                                View view2 = this.A00;
                                view2.getClass();
                                return view2;
                            }
                            from = LayoutInflater.from(context);
                            i2 = R.layout.sac_nux_follow_accounts_description_row;
                        } else {
                            from = LayoutInflater.from(context);
                            i2 = R.layout.sac_nux_follow_accounts_page_header_row;
                        }
                        return from.inflate(i2, viewGroup, false);
                    }
                    View A0A = AbstractC31172DnG.A0A(LayoutInflater.from(context), viewGroup, R.layout.sac_nux_follow_accounts_see_more_row);
                    A0A.setTag(new C34460FGy(A0A));
                    int i3 = 3;
                    for (FQK fqk : this.A04) {
                        if (i >= i3 && i < fqk.A01 + i3) {
                            C34460FGy c34460FGy = (C34460FGy) AbstractC31172DnG.A0x(A0A);
                            int size = fqk.A05.size();
                            int i4 = fqk.A00;
                            Integer B7X = fqk.A04.A03.B7X();
                            int i5 = size - i4;
                            int i6 = 10;
                            if (fqk.A03) {
                                i6 = 50;
                            }
                            if (i5 < i6) {
                                if (fqk.A02 != null) {
                                    if (B7X != null) {
                                        i5 = Math.min(B7X.intValue() - i4, i6);
                                    } else {
                                        i5 = -1;
                                    }
                                }
                            } else {
                                i5 = i6;
                            }
                            ENJ enj = this.A08;
                            TextView textView = c34460FGy.A00;
                            Context context2 = textView.getContext();
                            if (i5 == -1) {
                                A0a = context2.getString(2131962679);
                            } else {
                                A0a = AbstractC31177DnL.A0a(context2, i5, 2131962680);
                            }
                            textView.setText(A0a);
                            ViewOnClickListenerC35688FpN.A00(textView, enj, fqk, i5, 20);
                            return A0A;
                        }
                        i3 += fqk.A01;
                    }
                    return A0A;
                }
                A00 = AbstractC31578Du6.A00(context, viewGroup);
                if (getItem(i) == null) {
                    return A00;
                }
                c31579Du7 = (C31579Du7) AbstractC31172DnG.A0x(A00);
                userSession = this.A07;
                item = getItem(i);
            } else {
                View A0A2 = AbstractC31172DnG.A0A(LayoutInflater.from(context), viewGroup, R.layout.sac_nux_follow_accounts_header_row);
                A0A2.setTag(new C34459FGx(A0A2));
                if (getItem(i) == null) {
                    return A0A2;
                }
                C34459FGx c34459FGx = (C34459FGx) AbstractC31172DnG.A0x(A0A2);
                String username = ((User) getItem(i)).getUsername();
                TextView textView2 = c34459FGx.A00;
                AbstractC31177DnL.A0r(textView2.getContext(), textView2, username, 2131962678);
                return A0A2;
            }
        }
        InterfaceC37297Gby interfaceC37297Gby = this.A09;
        AbstractC31578Du6.A01(null, this.A05, this.A06, userSession, null, (User) item, null, null, interfaceC37297Gby, c31579Du7, this.A0A, false, true, false, false);
        return A00;
    }

    public C31768DxP(Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession, ENJ enj, InterfaceC37297Gby interfaceC37297Gby, C31538DtO c31538DtO) {
        this.A05 = context;
        this.A07 = userSession;
        this.A08 = enj;
        this.A09 = interfaceC37297Gby;
        this.A06 = interfaceC11380iw;
        this.A0A = c31538DtO;
    }
}
