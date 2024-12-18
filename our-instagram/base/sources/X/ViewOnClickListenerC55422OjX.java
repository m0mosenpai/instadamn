package X;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.Fragment;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.modal.TransparentModalActivity;
import com.instagram.tagging.activity.TaggingActivity;
import com.instagram.tagging.api.model.MediaSuggestedProductTag;
import com.instagram.tagging.widget.TagsInteractiveLayout;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.OjX, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class ViewOnClickListenerC55422OjX implements View.OnClickListener {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;

    public ViewOnClickListenerC55422OjX(int i, Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        this.A00 = i;
        this.A05 = obj4;
        this.A02 = obj3;
        this.A04 = obj5;
        this.A01 = obj;
        this.A03 = obj2;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05;
        int i;
        String id;
        Integer num;
        KeyEvent.Callback callback;
        switch (this.A00) {
            case 0:
                A05 = C0f9.A05(-1732738026);
                UserSession userSession = (UserSession) this.A05;
                C8JY A00 = C8JX.A00(userSession);
                C22P c22p = (C22P) this.A02;
                A00.A00(c22p, null);
                Bundle A002 = AbstractC86593tX.A0C(c22p).A00();
                List list = (List) this.A04;
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    AbstractC37301Gc2.A1O(userSession, (C38321qM) it.next());
                }
                ArrayList A0q = AbstractC167017dG.A0q(list);
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    A0q.add(AbstractC37302Gc3.A0g(it2));
                }
                A002.putStringArrayList("ClipsConstants.ARG_CLIPS_AUTO_CREATED_CLIPS_SELECTED_SOURCE_MEDIA_ID_LIST", AbstractC166987dD.A1F(A0q));
                A002.putSerializable("ClipsConstants.ARGS_CLIPS_CREATION_TYPE", C5JK.A05);
                C6XJ A02 = C6XJ.A02((Activity) this.A01, A002, userSession, TransparentModalActivity.class, "clips_camera");
                AbstractC31179DnN.A1S(A02);
                A02.A0D((Fragment) this.A03, 9587);
                i = -975761947;
                C0f9.A0C(i, A05);
                return;
            case 1:
                A05 = C0f9.A05(1130051780);
                C38321qM c38321qM = (C38321qM) this.A04;
                if (c38321qM != null && (id = c38321qM.getId()) != null) {
                    Context context = (Context) this.A02;
                    UserSession userSession2 = (UserSession) this.A05;
                    C48639LfH c48639LfH = new C48639LfH(context, (Fragment) this.A03, (InterfaceC11380iw) this.A01, userSession2, id);
                    if (OXs.A02(userSession2, c38321qM)) {
                        num = C05F.A05;
                    } else {
                        num = C05F.A04;
                    }
                    c48639LfH.Eo2(null, null, null, num, null, null);
                }
                i = -1403414;
                C0f9.A0C(i, A05);
                return;
            case 2:
                A05 = C0f9.A05(405359356);
                NOJ noj = (NOJ) this.A05;
                C51654Mrl c51654Mrl = (C51654Mrl) this.A04;
                View view2 = (View) this.A02;
                ViewGroup viewGroup = (ViewGroup) this.A01;
                int i2 = C3OO.FLAG_ADAPTER_FULLUPDATE;
                if (view2.getVisibility() == 0) {
                    java.util.Set A01 = NOJ.A01(c51654Mrl);
                    C12500ku c12500ku = new C12500ku(viewGroup);
                    while (c12500ku.hasNext()) {
                        View A0A = MSW.A0A(c12500ku);
                        if (AbstractC001800i.A0u(A01, A0A.getTag()) && !((CompoundButton) A0A.findViewById(R.id.checkbox)).isChecked()) {
                            java.util.Set A012 = NOJ.A01(c51654Mrl);
                            AbstractC51367MmS.A00(viewGroup);
                            View findViewWithTag = viewGroup.findViewWithTag(AbstractC001800i.A09(A012));
                            NestedScrollView nestedScrollView = noj.A05;
                            ViewGroup viewGroup2 = null;
                            if (nestedScrollView != null) {
                                callback = AnonymousClass040.A00(nestedScrollView, 0);
                            } else {
                                callback = null;
                            }
                            if (callback instanceof ViewGroup) {
                                viewGroup2 = (ViewGroup) callback;
                            }
                            if (findViewWithTag != null && viewGroup2 != null) {
                                Rect rect = noj.A02;
                                viewGroup2.getLocalVisibleRect(rect);
                                int i3 = rect.bottom;
                                findViewWithTag.getDrawingRect(rect);
                                viewGroup2.offsetDescendantRectToMyCoords(findViewWithTag, rect);
                                int i4 = rect.bottom;
                                if (nestedScrollView != null) {
                                    nestedScrollView.A0D(i4 - i3);
                                }
                            }
                            C12500ku c12500ku2 = new C12500ku(viewGroup);
                            while (c12500ku2.hasNext()) {
                                View A0A2 = MSW.A0A(c12500ku2);
                                View findViewById = A0A2.findViewById(R.id.custom_disclaimer_error_group);
                                if (findViewById != null) {
                                    int i5 = 0;
                                    if (!AbstractC001800i.A0u(A012, A0A2.getTag()) || ((CompoundButton) A0A2.findViewById(R.id.checkbox)).isChecked()) {
                                        i5 = 8;
                                    }
                                    findViewById.setVisibility(i5);
                                }
                            }
                            i = 1547649545;
                            C0f9.A0C(i, A05);
                            return;
                        }
                    }
                }
                boolean z = noj.A01;
                C54841OMk c54841OMk = (C54841OMk) this.A03;
                if (!z) {
                    c54841OMk.A01();
                    NestedScrollView nestedScrollView2 = noj.A05;
                    if (nestedScrollView2 != null) {
                        nestedScrollView2.post(new PNE(noj));
                    }
                } else {
                    c54841OMk.A06(true);
                }
                i = 1547649545;
                C0f9.A0C(i, A05);
                return;
            case 3:
                A05 = C0f9.A05(886834919);
                UserSession userSession3 = (UserSession) this.A05;
                EnumC201098ur enumC201098ur = EnumC201098ur.ACCEPT;
                C38321qM c38321qM2 = ((C54563O8p) this.A04).A01;
                C55202OeD.A04(enumC201098ur, userSession3, c38321qM2.getId(), null);
                C79923hh.A05((Fragment) this.A02, C79923hh.A00(C82G.A0b, new C55879OrT((C54722OEz) this.A03, (ENZ) this.A01), userSession3, c38321qM2, C05F.A15), userSession3);
                i = 403767085;
                C0f9.A0C(i, A05);
                return;
            case 4:
                A05 = C0f9.A05(-1927922543);
                UserSession userSession4 = (UserSession) this.A05;
                EnumC201098ur enumC201098ur2 = EnumC201098ur.ACCEPT;
                C38321qM c38321qM3 = ((C54564O8q) this.A04).A01;
                C55202OeD.A02(enumC201098ur2, userSession4, c38321qM3.getId());
                C79923hh.A05((Fragment) this.A02, C79923hh.A00(C82G.A0b, new C55879OrT((C54722OEz) this.A03, (ENZ) this.A01), userSession4, c38321qM3, C05F.A15), userSession4);
                i = 35177012;
                C0f9.A0C(i, A05);
                return;
            default:
                A05 = C0f9.A05(-1909625131);
                TaggingActivity taggingActivity = (TaggingActivity) this.A05;
                if (taggingActivity.CLc()) {
                    taggingActivity.Elk();
                } else {
                    EnumC53319Nhv enumC53319Nhv = taggingActivity.A0I;
                    if (enumC53319Nhv == null) {
                        C14360o3.A0F("tagType");
                        throw C00O.createAndThrow();
                    }
                    EnumC53319Nhv enumC53319Nhv2 = EnumC53319Nhv.A08;
                    if (enumC53319Nhv != enumC53319Nhv2) {
                        TaggingActivity.A0L(taggingActivity, enumC53319Nhv2, false);
                    }
                    TagsInteractiveLayout tagsInteractiveLayout = (TagsInteractiveLayout) this.A04;
                    taggingActivity.Cow(tagsInteractiveLayout, (ArrayList) this.A01, (ArrayList) this.A02);
                    tagsInteractiveLayout.A08(((MediaSuggestedProductTag) this.A03).A00);
                }
                i = -1687381529;
                C0f9.A0C(i, A05);
                return;
        }
    }
}
