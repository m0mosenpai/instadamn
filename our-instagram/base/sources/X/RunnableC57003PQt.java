package X;

import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.igds.components.peoplecell.IgdsPeopleCell;
import com.instagram.leadads.viewmodel.LeadAdsPostClickEntryViewModel;
import com.instagram.leadgen.core.model.LeadGenFormBaseQuestion;
import com.instagram.leadgen.core.model.LeadGenProfileContentInfo;
import com.instagram.leadgen.core.ui.LeadGenFormShortAnswerQuestionView;
import java.util.List;

/* renamed from: X.PQt, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class RunnableC57003PQt implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ AbstractC52562NNi A01;

    public RunnableC57003PQt(AbstractC52562NNi abstractC52562NNi, int i) {
        this.A01 = abstractC52562NNi;
        this.A00 = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        View view;
        String str;
        int i;
        IgImageView igImageView;
        C53022Ncu c53022Ncu;
        EnumC53270Nh8 enumC53270Nh8;
        AbstractC51367MmS abstractC51367MmS;
        NO5 no5;
        RecyclerView recyclerView;
        AbstractC52562NNi abstractC52562NNi = this.A01;
        ViewPager2 viewPager2 = abstractC52562NNi.A00;
        C3OO c3oo = null;
        int i2 = 0;
        if (viewPager2 != null) {
            view = AnonymousClass040.A00(viewPager2, 0);
        } else {
            view = null;
        }
        if ((view instanceof RecyclerView) && (recyclerView = (RecyclerView) view) != null) {
            c3oo = recyclerView.A0V(this.A00);
        }
        if ((c3oo instanceof AbstractC51367MmS) && (abstractC51367MmS = (AbstractC51367MmS) c3oo) != null && !(abstractC51367MmS instanceof NOM) && !(abstractC51367MmS instanceof NOL) && !(abstractC51367MmS instanceof NOJ)) {
            if (abstractC51367MmS instanceof NOQ) {
                NOQ noq = (NOQ) abstractC51367MmS;
                LeadGenFormShortAnswerQuestionView leadGenFormShortAnswerQuestionView = noq.A03;
                leadGenFormShortAnswerQuestionView.A0I();
                if (AbstractC001900j.A0T(leadGenFormShortAnswerQuestionView.getText()) && !noq.A01) {
                    leadGenFormShortAnswerQuestionView.A0E();
                }
                C51654Mrl c51654Mrl = noq.A00;
                if (c51654Mrl != null && c51654Mrl.A0F && noq.getBindingAdapterPosition() == 0) {
                    LeadGenFormBaseQuestion leadGenFormBaseQuestion = (LeadGenFormBaseQuestion) AbstractC166987dD.A16(c51654Mrl.A09);
                    C54841OMk c54841OMk = ((AbstractC51367MmS) noq).A00;
                    if (c54841OMk != null) {
                        c54841OMk.A05(leadGenFormBaseQuestion, leadGenFormBaseQuestion.A00, true);
                    }
                    C54841OMk c54841OMk2 = ((AbstractC51367MmS) noq).A00;
                    if (c54841OMk2 != null) {
                        c54841OMk2.A06(true);
                    }
                }
            } else if (abstractC51367MmS instanceof NOO) {
                NOO noo = (NOO) abstractC51367MmS;
                C51654Mrl c51654Mrl2 = noo.A00;
                if (c51654Mrl2 != null && c51654Mrl2.A0F && noo.getBindingAdapterPosition() == 0) {
                    boolean z = false;
                    LeadGenFormBaseQuestion leadGenFormBaseQuestion2 = (LeadGenFormBaseQuestion) c51654Mrl2.A09.get(0);
                    List list = leadGenFormBaseQuestion2.A0C;
                    if (list != null && list.contains(leadGenFormBaseQuestion2.A00)) {
                        z = true;
                    }
                    C54841OMk c54841OMk3 = ((AbstractC51367MmS) noo).A00;
                    if (c54841OMk3 != null) {
                        c54841OMk3.A05(leadGenFormBaseQuestion2, leadGenFormBaseQuestion2.A00, true);
                    }
                    C54841OMk c54841OMk4 = ((AbstractC51367MmS) noo).A00;
                    if (c54841OMk4 != null) {
                        c54841OMk4.A06(!z);
                    }
                }
            } else if (!(abstractC51367MmS instanceof NOI) && !(abstractC51367MmS instanceof NOK) && !(abstractC51367MmS instanceof NON) && !(abstractC51367MmS instanceof NOR)) {
                C12500ku c12500ku = new C12500ku(((NOP) abstractC51367MmS).A00);
                while (c12500ku.hasNext()) {
                    View A0A = MSW.A0A(c12500ku);
                    if ((A0A instanceof NO5) && (no5 = (NO5) A0A) != null) {
                        no5.A0I();
                    }
                }
            }
        }
        NOW A0d = MSW.A0d(abstractC52562NNi);
        int i3 = this.A00;
        A0d.A02(i3);
        NOW A0d2 = MSW.A0d(abstractC52562NNi);
        C51654Mrl A0F = AbstractC50523MSb.A0F(A0d2.A0a, i3);
        if (A0F != null && A0d2.A04 && A0F.A03 == EnumC53189Nfl.A03 && !A0d2.A0D) {
            UserSession userSession = A0d2.A0H;
            C14360o3.A0A(AbstractC166997dE.A0c(AbstractC25225BEi.A0j(userSession, 0), userSession, 36317882677728914L));
        }
        boolean A1S = AbstractC31175DnJ.A1S(i3);
        Fragment fragment = abstractC52562NNi.mParentFragment;
        if ((fragment instanceof C53022Ncu) && (c53022Ncu = (C53022Ncu) fragment) != null) {
            C05A c05a = ((LeadAdsPostClickEntryViewModel) c53022Ncu.A04.getValue()).A08;
            if (((EnumC53270Nh8) c05a.getValue()).A02) {
                if (A1S) {
                    enumC53270Nh8 = EnumC53270Nh8.A06;
                } else {
                    enumC53270Nh8 = EnumC53270Nh8.A07;
                }
                c05a.Egh(enumC53270Nh8);
            }
        }
        N43 n43 = abstractC52562NNi.A02;
        if (n43 != null && (igImageView = n43.A03) != null) {
            igImageView.setVisibility(AbstractC167007dF.A05(!A1S ? 1 : 0));
        }
        N43 n432 = abstractC52562NNi.A02;
        if (n432 != null) {
            boolean A1a = AbstractC31174DnI.A1a(EnumC53189Nfl.A0B, AbstractC52562NNi.A00(abstractC52562NNi));
            boolean z2 = MSW.A0d(abstractC52562NNi).A0A;
            boolean A1W = AbstractC167007dF.A1W(MSW.A0d(abstractC52562NNi).A00);
            IgTextView igTextView = n432.A01;
            if (igTextView != null) {
                if (A1a) {
                    if (z2) {
                        i = 2131964899;
                    } else {
                        i = 2131964852;
                        if (A1W) {
                            i = 2131964889;
                        }
                    }
                    str = n432.getString(i);
                } else {
                    str = n432.A04;
                }
                igTextView.setText(str);
            }
        }
        IgdsPeopleCell igdsPeopleCell = abstractC52562NNi.A01;
        if (igdsPeopleCell != null) {
            if (!A1S || !MSW.A0d(abstractC52562NNi).A09) {
                i2 = 8;
            }
            igdsPeopleCell.setVisibility(i2);
        }
        if (MSW.A0d(abstractC52562NNi).A0B) {
            AbstractC52562NNi.A02(abstractC52562NNi, (LeadGenProfileContentInfo) MSW.A0d(abstractC52562NNi).A0b.getValue());
        }
    }
}
