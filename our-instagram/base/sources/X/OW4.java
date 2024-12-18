package X;

import android.content.Context;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Collections;

/* loaded from: classes9.dex */
public final class OW4 {
    public View A00;
    public ListView A01;
    public PopupWindow A02;
    public C52190N8f A03;
    public boolean A04;
    public final Context A06;
    public final View A08;
    public final AbstractC59962oe A09;
    public final UserSession A0A;
    public final InterfaceC58041PoR A0B;
    public final boolean A0C;
    public final boolean A0D;
    public final Handler A07 = AbstractC167007dF.A0J();
    public boolean A05 = true;

    public OW4(Context context, View view, AbstractC59962oe abstractC59962oe, UserSession userSession, InterfaceC58041PoR interfaceC58041PoR, boolean z, boolean z2) {
        this.A06 = context;
        this.A0A = userSession;
        this.A09 = abstractC59962oe;
        this.A08 = view;
        this.A0B = interfaceC58041PoR;
        this.A0D = z;
        this.A0C = z2;
        this.A03 = new C52190N8f(context, z);
        View A0C = AbstractC25227BEk.A0C(LayoutInflater.from(this.A06), R.layout.mention_conversion_pop_up);
        this.A00 = A0C;
        if (A0C != null) {
            ListView listView = (ListView) A0C.requireViewById(R.id.mention_conversion_options_list_view);
            this.A01 = listView;
            if (listView != null) {
                listView.setFooterDividersEnabled(false);
                ListView listView2 = this.A01;
                if (listView2 != null) {
                    listView2.setOverScrollMode(2);
                    ListView listView3 = this.A01;
                    if (listView3 != null) {
                        listView3.setAdapter((ListAdapter) this.A03);
                        View A0S = AbstractC166997dE.A0S(A0C, R.id.divider);
                        if (this.A0D) {
                            A0S.setVisibility(8);
                        }
                        ListView listView4 = this.A01;
                        if (listView4 != null) {
                            listView4.setOnItemClickListener(new C55515Ol8(this, 0));
                        }
                    }
                }
            }
            C14360o3.A0F("mentionConversionOptionsListView");
            throw C00O.createAndThrow();
        }
        PopupWindow popupWindow = new PopupWindow();
        this.A02 = popupWindow;
        popupWindow.setInputMethodMode(1);
        PopupWindow popupWindow2 = this.A02;
        if (popupWindow2 != null) {
            popupWindow2.setBackgroundDrawable(this.A06.getDrawable(R.drawable.auto_dropdown_background));
            PopupWindow popupWindow3 = this.A02;
            if (popupWindow3 != null) {
                popupWindow3.setOutsideTouchable(true);
                PopupWindow popupWindow4 = this.A02;
                if (popupWindow4 != null) {
                    popupWindow4.setAnimationStyle(R.style.MentionConversionPopupStyle);
                    PopupWindow popupWindow5 = this.A02;
                    if (popupWindow5 != null) {
                        popupWindow5.setOnDismissListener(new C55523OlH(this, 1));
                        return;
                    }
                }
            }
        }
        C14360o3.A0F("popupWindow");
        throw C00O.createAndThrow();
    }

    public final boolean A01() {
        this.A04 = true;
        PopupWindow popupWindow = this.A02;
        if (popupWindow == null) {
            C14360o3.A0F("popupWindow");
            throw C00O.createAndThrow();
        }
        if (popupWindow.isShowing()) {
            popupWindow.dismiss();
            return true;
        }
        return false;
    }

    public static final void A00(OW4 ow4, User user, boolean z) {
        EnumC53348Niy enumC53348Niy;
        InterfaceC58041PoR interfaceC58041PoR = ow4.A0B;
        if (interfaceC58041PoR != null) {
            interfaceC58041PoR.DxU(user, z);
        }
        if (z) {
            enumC53348Niy = EnumC53348Niy.COLLAB;
        } else {
            enumC53348Niy = EnumC53348Niy.USER_TAG;
        }
        C22C A01 = AnonymousClass229.A01(ow4.A0A);
        C25531Mh A0G = MSW.A0G(A01);
        EnumC114925Hg A0J = A01.A0J();
        C22M c22m = ((C22F) A01).A04;
        String str = c22m.A0L;
        EnumC50631MWs enumC50631MWs = c22m.A0C;
        if (AbstractC25226BEj.A1Z(A0G) && A0J != null && str != null && enumC50631MWs != null) {
            A0G.A0a(A0J);
            A0G.A0q("MENTION_PROMPT_TAP");
            AbstractC167007dF.A14(A0G, c22m);
            MSW.A1P(enumC50631MWs, A0G);
            A0G.A0R("camera_session_id", str);
            AbstractC167007dF.A13(A0G);
            A0G.A0c(c22m.A0A);
            MSY.A1A(A0G);
            ArrayList A17 = AbstractC25225BEi.A17(1);
            Object obj = new Object[]{enumC53348Niy}[0];
            obj.getClass();
            A17.add(obj);
            A0G.A0S("mention_prompt_options", Collections.unmodifiableList(A17));
            A0G.Cht();
        }
        int i = 2131966278;
        if (z) {
            i = 2131966277;
        }
        C146106i8 A0Y = AbstractC31174DnI.A0Y();
        A0Y.A0B(EnumC142006bJ.A03);
        A0Y.A09 = user.Bhu();
        Context context = ow4.A06;
        A0Y.A0D = AbstractC31178DnM.A0c(context, user, i);
        AbstractC31175DnJ.A0l(context, A0Y, 2131976066);
        A0Y.A0L = true;
        A0Y.A0A = new P3J(ow4, user, z);
        AbstractC31178DnM.A1S(A0Y);
    }
}
