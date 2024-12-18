package X;

import android.content.Context;
import android.graphics.PointF;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.api.schemas.FBTagType;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.segmentedtabs.IgSegmentedTabLayout;
import com.instagram.model.fbusertag.FBUserTag;
import com.instagram.model.people.PeopleTag;
import com.instagram.tagging.activity.TaggingActivity;
import com.instagram.tagging.activity.mediaTaggingInfo.MediaTaggingInfo;
import com.instagram.tagging.widget.PhotoScrollView;
import com.instagram.user.model.Product;
import com.instagram.user.model.ProductCollection;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes9.dex */
public final class PHA implements InterfaceC58082Pp7, InterfaceC37295Gbw {
    public final UserSession A00;
    public final InterfaceC58306Psy A01;

    @Override // X.InterfaceC43444JHi
    public final void A8F(User user) {
    }

    @Override // X.InterfaceC37183GZu
    public final FragmentActivity B8O() {
        return null;
    }

    @Override // X.InterfaceC43445JHj
    public final void CvL(Product product) {
    }

    @Override // X.InterfaceC43444JHi
    public final void D7m(User user) {
    }

    @Override // X.InterfaceC43422JGm
    public final void D9b(ProductCollection productCollection) {
    }

    @Override // X.InterfaceC37182GZt
    public final void DDE(Context context, User user, String str, int i) {
    }

    @Override // X.InterfaceC37183GZu
    public final void DFQ(FBUserTag fBUserTag) {
    }

    @Override // X.InterfaceC37182GZt
    public final void DT2(User user, int i) {
    }

    @Override // X.InterfaceC37184GZv, X.InterfaceC37182GZt
    public final void Dy8(User user, int i) {
    }

    @Override // X.InterfaceC43444JHi
    public final void EDC(View view) {
    }

    @Override // X.InterfaceC58082Pp7
    public final void AAT(User user, boolean z) {
        InterfaceC58306Psy interfaceC58306Psy = this.A01;
        Iterator it = interfaceC58306Psy.BcJ().iterator();
        while (true) {
            if (it.hasNext()) {
                if (MSZ.A0v(it).equals(user.getId())) {
                    break;
                }
            } else {
                PeopleTag peopleTag = new PeopleTag(new PointF(), user);
                peopleTag.A09(user);
                interfaceC58306Psy.BcJ().add(peopleTag);
                if (z) {
                    interfaceC58306Psy.A89(user);
                }
            }
        }
        AVh();
    }

    @Override // X.InterfaceC58082Pp7
    public final void AVh() {
        TaggingActivity taggingActivity = (TaggingActivity) this.A01;
        TaggingActivity.A0J(taggingActivity);
        EnumC53319Nhv enumC53319Nhv = taggingActivity.A0I;
        String str = null;
        if (enumC53319Nhv == null) {
            C14360o3.A0F("tagType");
            throw C00O.createAndThrow();
        }
        if (enumC53319Nhv == EnumC53319Nhv.A07) {
            str = "PeopleTagSearch";
        }
        taggingActivity.getSupportFragmentManager().A18(str, 1);
        IgSegmentedTabLayout igSegmentedTabLayout = taggingActivity.A08;
        if (igSegmentedTabLayout != null) {
            igSegmentedTabLayout.setVisibility(0);
            PhotoScrollView photoScrollView = taggingActivity.A0J;
            if (photoScrollView != null) {
                AbstractC13880nE.A0U(photoScrollView, AbstractC43594JPz.A06(taggingActivity));
            }
        }
        TaggingActivity.A0H(taggingActivity);
        TaggingActivity.A0D(taggingActivity);
    }

    @Override // X.InterfaceC43445JHj
    public final void D9a(Product product) {
        InterfaceC58306Psy interfaceC58306Psy = this.A01;
        ArrayList BhN = interfaceC58306Psy.BhN();
        Iterator it = BhN.iterator();
        while (it.hasNext()) {
            com.instagram.tagging.model.Tag tag = (com.instagram.tagging.model.Tag) it.next();
            if (tag.getId().equals(product.A0H)) {
                BhN.remove(tag);
                TaggingActivity.A0K((TaggingActivity) interfaceC58306Psy, tag);
                return;
            }
        }
    }

    @Override // X.InterfaceC37183GZu
    public final void DFR(FBUserTag fBUserTag) {
        TaggingActivity taggingActivity = (TaggingActivity) this.A01;
        ArrayList arrayList = taggingActivity.A0N;
        if (arrayList != null) {
            AbstractC50523MSb.A0K(taggingActivity, arrayList).A0A.remove(fBUserTag);
            if (FBTagType.A07 == fBUserTag.A01) {
                ArrayList arrayList2 = taggingActivity.A0N;
                if (arrayList2 != null) {
                    Iterator A13 = AbstractC166997dE.A13(arrayList2);
                    while (A13.hasNext()) {
                        ((MediaTaggingInfo) AbstractC166997dE.A0l(A13)).A0A.remove(fBUserTag);
                    }
                }
            }
            TaggingActivity.A0K(taggingActivity, fBUserTag);
            return;
        }
        AbstractC50522MSa.A0t();
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC37184GZv
    public final void DKa(User user, boolean z) {
        InterfaceC58306Psy interfaceC58306Psy = this.A01;
        Iterator it = interfaceC58306Psy.BcJ().iterator();
        while (it.hasNext()) {
            PeopleTag peopleTag = (PeopleTag) it.next();
            if (peopleTag.getId().equals(user.getId())) {
                peopleTag.A02 = !z;
                TaggingActivity taggingActivity = (TaggingActivity) interfaceC58306Psy;
                View view = (View) taggingActivity.A0m.get(taggingActivity.A0X());
                if (view != null) {
                    EnumC53319Nhv A01 = peopleTag.A01();
                    if (A01 == EnumC53319Nhv.A07) {
                        AbstractC50789Mc6 abstractC50789Mc6 = (AbstractC50789Mc6) view.findViewWithTag(peopleTag);
                        if (abstractC50789Mc6 != null) {
                            abstractC50789Mc6.setText(AbstractC41370ISx.A01(view.getContext(), peopleTag));
                        }
                    } else if (A01 == EnumC53319Nhv.A05 && view.findViewWithTag(peopleTag) != null) {
                        throw AbstractC166987dD.A15("mFbUser");
                    }
                }
                TaggingActivity.A0H(taggingActivity);
                TaggingActivity.A0D(taggingActivity);
                return;
            }
        }
    }

    @Override // X.InterfaceC37184GZv
    public final void Dew(User user) {
        InterfaceC58306Psy interfaceC58306Psy = this.A01;
        ArrayList BcJ = interfaceC58306Psy.BcJ();
        Iterator it = BcJ.iterator();
        while (it.hasNext()) {
            PeopleTag peopleTag = (PeopleTag) it.next();
            if (peopleTag.getId().equals(user.getId())) {
                BcJ.remove(peopleTag);
                TaggingActivity taggingActivity = (TaggingActivity) interfaceC58306Psy;
                TaggingActivity.A0O(taggingActivity, peopleTag.A07());
                TaggingActivity.A0K(taggingActivity, peopleTag);
                return;
            }
        }
    }

    @Override // X.GYN
    public final void Ds5() {
        this.A01.Ds5();
    }

    @Override // X.InterfaceC43445JHj
    public final boolean Eja(Product product) {
        AbstractC76433bn.A00(product.A0B).getClass();
        return !r1.equals(this.A00.userId);
    }

    public PHA(UserSession userSession, InterfaceC58306Psy interfaceC58306Psy) {
        this.A00 = userSession;
        this.A01 = interfaceC58306Psy;
    }
}
