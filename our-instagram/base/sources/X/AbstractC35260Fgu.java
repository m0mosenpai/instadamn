package X;

import android.content.Context;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.save.model.SavedCollection;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;

/* renamed from: X.Fgu, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC35260Fgu {
    public static void A01(Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession, SavedCollection savedCollection, SavedCollection savedCollection2, Runnable runnable, List list) {
        C25671My A00 = AbstractC25651Mw.A00(userSession);
        AbstractC35086Fcx.A02(savedCollection, savedCollection2, list);
        C36116Fwq.A00(A00, savedCollection, list);
        String moduleName = interfaceC11380iw.getModuleName();
        C25621Ms A0M = AbstractC31173DnH.A0M(userSession);
        A0M.A0B("collections/bulk_move/");
        JSONArray A0p = AbstractC31171DnF.A0p();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            A0p.put(AbstractC31172DnG.A0i(it).A2u());
        }
        A0M.A9s("media_ids", A0p.toString());
        A0M.A9s("source_collection_id", savedCollection.A0F);
        A0M.A9s("target_collection_id", savedCollection2.A0F);
        AbstractC31176DnK.A1P(A0M, "module_name", moduleName);
        C1ON A0N = A0M.A0N();
        A0N.A00 = new ETZ(2, context, interfaceC11380iw, userSession, savedCollection2, savedCollection, runnable, list);
        C1GJ.A03(A0N);
    }

    public static void A03(Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession, SavedCollection savedCollection, Runnable runnable, List list) {
        AbstractC35086Fcx.A00(AbstractC25651Mw.A00(userSession), savedCollection, list);
        G99 g99 = new G99(2, list, savedCollection, userSession, interfaceC11380iw, runnable, context);
        C38321qM A0x = AbstractC25225BEi.A0x(list, 0);
        int size = list.size();
        C14360o3.A0B(context, 0);
        C14360o3.A0B(A0x, 2);
        C146106i8 A0K = AbstractC31171DnF.A0K();
        AbstractC31181DnP.A0P(context.getResources(), A0x, A0K, R.plurals.save_home_bulk_edit_remove_from_collection_failure_notification, size);
        A0K.A0A(g99);
        A0K.A0G = AbstractC166997dE.A0q(context.getResources(), 2131972568);
        AbstractC31178DnM.A1S(A0K);
    }

    public static void A04(Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession, SavedCollection savedCollection, Runnable runnable, List list) {
        try {
            AbstractC35086Fcx.A01(AbstractC25651Mw.A00(userSession), savedCollection, list);
            String str = savedCollection.A0F;
            ArrayList A00 = A00(list);
            String moduleName = interfaceC11380iw.getModuleName();
            C25621Ms A0M = AbstractC31173DnH.A0M(userSession);
            A0M.A0L("collections/%s/edit/", str);
            A0M.A9s("removed_media_ids", AbstractC13590ml.A00(A00));
            A0M.A9s("module_name", moduleName);
            A0M.A0S(SavedCollection.class, C70139W6r.class);
            C1ON A0U = AbstractC31172DnG.A0U(A0M, true);
            A0U.A00 = new HGH(3, context, userSession, runnable, savedCollection, list, interfaceC11380iw);
            C1GJ.A03(A0U);
        } catch (IOException unused) {
            A03(context, interfaceC11380iw, userSession, savedCollection, runnable, list);
        }
    }

    public static void A07(Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession, SavedCollection savedCollection, List list) {
        AbstractC35086Fcx.A01(AbstractC25651Mw.A00(userSession), savedCollection, list);
        AbstractC35236FgV.A02(context, (C38321qM) AbstractC166987dD.A16(list), new G98(2, savedCollection, context, list, userSession, interfaceC11380iw), list.size());
    }

    public static void A08(Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession, Runnable runnable, List list) {
        C25671My A00 = AbstractC25651Mw.A00(userSession);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            FXM.A00(userSession, EnumC77213d7.A04, EnumC77213d7.A03, AbstractC31172DnG.A0i(it));
        }
        A00.E4s(new C36116Fwq(EnumC33416Epn.A05, null, list));
        String moduleName = interfaceC11380iw.getModuleName();
        C25621Ms A0M = AbstractC31173DnH.A0M(userSession);
        A0M.A0B("collections/bulk_remove/");
        JSONArray A0p = AbstractC31171DnF.A0p();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            A0p.put(AbstractC31172DnG.A0i(it2).A2u());
        }
        A0M.A9s("media_ids", A0p.toString());
        AbstractC31176DnK.A1P(A0M, "module_name", moduleName);
        C1ON A0N = A0M.A0N();
        A0N.A00 = new EU1(4, list, interfaceC11380iw, userSession, context, runnable);
        C1GJ.A03(A0N);
    }

    public static void A02(Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession, SavedCollection savedCollection, Runnable runnable, String str, List list, int i) {
        AbstractC35086Fcx.A01(AbstractC25651Mw.A00(userSession), savedCollection, list);
        ArrayList A00 = A00(list);
        try {
            String moduleName = interfaceC11380iw.getModuleName();
            String str2 = (String) A00.get(0);
            String str3 = savedCollection.A0F;
            C32503ETd c32503ETd = new C32503ETd(context, interfaceC11380iw, userSession, savedCollection, runnable, new GR7(context, interfaceC11380iw, userSession, savedCollection, runnable, str, list, i), list, i);
            C25621Ms A002 = AbstractC35217FgA.A00(null, userSession, null, false, str, moduleName, null, str2, null, null, A00);
            A002.A0B("collections/create_and_move/");
            C1ON A0T = AbstractC31172DnG.A0T(A002, "source_collection_id", str3);
            C31456Ds0.A00(A0T, c32503ETd, userSession, 44);
            C1GJ.A03(A0T);
        } catch (IOException unused) {
            AbstractC35086Fcx.A00(AbstractC25651Mw.A00(userSession), savedCollection, list);
            AbstractC35236FgV.A03(context, (C38321qM) AbstractC166987dD.A16(list), new G96(context, interfaceC11380iw, userSession, savedCollection, runnable, str, list, i), list.size());
        }
    }

    public static ArrayList A00(List list) {
        ArrayList A1E = AbstractC166987dD.A1E();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            A1E.add(AbstractC31172DnG.A0i(it).getId());
        }
        return A1E;
    }

    public static void A05(Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession, SavedCollection savedCollection, String str, List list, int i) {
        ArrayList A1E = AbstractC166987dD.A1E();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            A1E.add(AbstractC31172DnG.A0i(it).getId());
        }
        try {
            AbstractC35217FgA.A03(null, new C32503ETd(context, interfaceC11380iw, userSession, savedCollection, null, new GR4(context, interfaceC11380iw, userSession, savedCollection, str, list, i), list, i), userSession, str, interfaceC11380iw.getModuleName(), (String) A1E.get(0), A1E, false);
        } catch (IOException unused) {
            AbstractC35236FgV.A02(context, (C38321qM) AbstractC166987dD.A16(list), new G94(context, interfaceC11380iw, userSession, savedCollection, str, list, i), list.size());
        }
    }

    public static void A06(Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession, SavedCollection savedCollection, List list) {
        try {
            AbstractC35086Fcx.A00(AbstractC25651Mw.A00(userSession), savedCollection, list);
            String str = savedCollection.A0F;
            ArrayList A00 = A00(list);
            String moduleName = interfaceC11380iw.getModuleName();
            C25621Ms A0M = AbstractC31173DnH.A0M(userSession);
            A0M.A0L("collections/%s/edit/", str);
            A0M.A9s("added_media_ids", AbstractC13590ml.A00(A00));
            A0M.A9s("module_name", moduleName);
            A0M.A0S(SavedCollection.class, C70139W6r.class);
            C1ON A0U = AbstractC31172DnG.A0U(A0M, true);
            A0U.A00 = new EU1(3, context, interfaceC11380iw, userSession, savedCollection, list);
            C1GJ.A03(A0U);
        } catch (IOException unused) {
            A07(context, interfaceC11380iw, userSession, savedCollection, list);
        }
    }
}
