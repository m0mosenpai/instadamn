package X;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.OnLifecycleEvent;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.reels.question.model.QuestionResponseModelIntf;
import com.instagram.reels.question.model.QuestionResponsesModelIntf;
import instagram.features.stories.dashboard.fragment.ReelDashboardFragment;
import java.util.List;

/* renamed from: X.Gu9, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38372Gu9 extends C2UU implements InterfaceC41501vz, C07W {
    public QuestionResponsesModelIntf A00;
    public final List A01 = AbstractC166987dD.A1E();
    public final List A02 = AbstractC166987dD.A1E();
    public final int A03;
    public final C07T A04;
    public final InterfaceC11380iw A05;
    public final UserSession A06;
    public final ReelDashboardFragment A07;
    public final Integer A08;

    @Override // X.C2UU
    public final void onBindViewHolder(C3OO c3oo, int i) {
        int itemViewType = getItemViewType(i);
        if (itemViewType != 0) {
            if (itemViewType != 1) {
                if (itemViewType != 2) {
                    C38480Gw1 c38480Gw1 = (C38480Gw1) c3oo;
                    QuestionResponsesModelIntf questionResponsesModelIntf = this.A00;
                    questionResponsesModelIntf.getClass();
                    ReelDashboardFragment reelDashboardFragment = this.A07;
                    int i2 = C3OO.FLAG_ADAPTER_FULLUPDATE;
                    View view = c38480Gw1.A01;
                    Context context = view.getContext();
                    Drawable background = view.getBackground();
                    background.getClass();
                    ((GradientDrawable) background.mutate()).setColor(AbstractC13950nL.A05(Color.parseColor(questionResponsesModelIntf.getBackgroundColor())));
                    int parseColor = Color.parseColor(questionResponsesModelIntf.getTextColor());
                    AbstractC31177DnL.A0r(context, c38480Gw1.A02, String.valueOf(questionResponsesModelIntf.Bja()), 2131972005);
                    c38480Gw1.A04.setColorFilter(parseColor);
                    c38480Gw1.A03.A02();
                    c38480Gw1.A00 = new ViewOnClickListenerC42034Ik3(36, reelDashboardFragment, questionResponsesModelIntf);
                    return;
                }
                C41628IbJ c41628IbJ = ((IF7) this.A01.get(i)).A00;
                if (c41628IbJ != null) {
                    ReelDashboardFragment reelDashboardFragment2 = this.A07;
                    UserSession userSession = this.A06;
                    Integer num = this.A08;
                    I5Q.A00(this.A05, userSession, c41628IbJ, reelDashboardFragment2, (C38455Gvc) c3oo, num, i);
                    return;
                }
                throw AbstractC166997dE.A0g();
            }
            C41628IbJ c41628IbJ2 = ((IF7) this.A01.get(i)).A00;
            if (c41628IbJ2 != null) {
                I5R.A00(c41628IbJ2, this.A07, (C38479Gw0) c3oo, this.A08, i);
                return;
            }
            throw AbstractC166997dE.A0g();
        }
        C41628IbJ c41628IbJ3 = ((IF7) this.A01.get(i)).A00;
        if (c41628IbJ3 != null) {
            I5S.A00(c41628IbJ3, this.A07, (C38456Gvd) c3oo, this.A08, i);
            return;
        }
        throw AbstractC166997dE.A0g();
    }

    @Override // X.C2UU
    public final C3OO onCreateViewHolder(ViewGroup viewGroup, int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        return new C38480Gw1(AbstractC25228BEl.A0P(viewGroup).inflate(R.layout.question_response_see_all_card, viewGroup, false));
                    }
                    throw AbstractC25230BEn.A0n(AbstractC111324zv.A00(5525), i);
                }
                int i2 = C3OO.FLAG_ADAPTER_FULLUPDATE;
                return new C38455Gvc(AbstractC25228BEl.A0P(viewGroup).inflate(R.layout.question_response_item, viewGroup, false));
            }
            int i3 = C3OO.FLAG_ADAPTER_FULLUPDATE;
            return new C38479Gw0(AbstractC25228BEl.A0P(viewGroup).inflate(R.layout.question_response_item, viewGroup, false));
        }
        int i4 = C3OO.FLAG_ADAPTER_FULLUPDATE;
        return new C38456Gvd(AbstractC25228BEl.A0P(viewGroup).inflate(R.layout.question_response_item, viewGroup, false));
    }

    public static void A00(C38372Gu9 c38372Gu9) {
        int i;
        List list;
        c38372Gu9.A00.getClass();
        List list2 = c38372Gu9.A01;
        list2.clear();
        int i2 = 0;
        while (true) {
            i = c38372Gu9.A03;
            list = c38372Gu9.A02;
            if (i2 >= Math.min(i, list.size())) {
                break;
            }
            list2.add(I5K.A00(new C41628IbJ((QuestionResponseModelIntf) list.get(i2), c38372Gu9.A00)));
            i2++;
        }
        if (c38372Gu9.A00.BUt() || list.size() > i) {
            list2.add(new IF7(null, C05F.A0Y));
        }
        c38372Gu9.notifyDataSetChanged();
    }

    @OnLifecycleEvent(C07R.ON_DESTROY)
    public void removeEventListener() {
        AbstractC25651Mw.A00(this.A06).A02(this, C42244InU.class);
        this.A04.A0A(this);
    }

    public C38372Gu9(C07T c07t, InterfaceC11380iw interfaceC11380iw, UserSession userSession, ReelDashboardFragment reelDashboardFragment, Integer num) {
        int i;
        this.A04 = c07t;
        this.A06 = userSession;
        this.A07 = reelDashboardFragment;
        this.A08 = num;
        if (1 - num.intValue() != 0) {
            i = Integer.MAX_VALUE;
        } else {
            i = 16;
        }
        this.A03 = i;
        this.A05 = interfaceC11380iw;
        c07t.A09(this);
        AbstractC25651Mw.A00(userSession).A01(this, C42244InU.class);
    }

    @Override // X.C2UU
    public final int getItemCount() {
        int A03 = C0f9.A03(1417874254);
        int size = this.A01.size();
        C0f9.A0A(1114874868, A03);
        return size;
    }

    @Override // X.C2UU, android.widget.Adapter
    public final int getItemViewType(int i) {
        int i2;
        int A03 = C0f9.A03(2013441994);
        int intValue = ((IF7) this.A01.get(i)).A01.intValue();
        int i3 = 1;
        if (intValue != 1) {
            if (intValue != 2) {
                i3 = 3;
                if (intValue != 3) {
                    if (intValue == 4) {
                        i2 = -1488931045;
                    } else {
                        IllegalArgumentException A12 = AbstractC166987dD.A12("Unexpected QuestionResponseCardViewModel type");
                        C0f9.A0A(741117178, A03);
                        throw A12;
                    }
                } else {
                    C0f9.A0A(1358838802, A03);
                    return 2;
                }
            } else {
                i2 = 697727653;
            }
        } else {
            i3 = 0;
            i2 = -1360387355;
        }
        C0f9.A0A(i2, A03);
        return i3;
    }

    @Override // X.InterfaceC41501vz
    public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
        int A03 = C0f9.A03(1750439625);
        int A032 = C0f9.A03(-634383512);
        this.A02.remove(((C42244InU) obj).A00);
        A00(this);
        C0f9.A0A(1005267752, A032);
        C0f9.A0A(1970033358, A03);
    }
}
