package X;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import com.facebook.R;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.save.model.SavedCollection;

/* renamed from: X.FgV, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC35236FgV {
    public static final void A00(Activity activity, ImageUrl imageUrl, InterfaceC58152PqH interfaceC58152PqH, EnumC33416Epn enumC33416Epn, String str, String str2, boolean z, boolean z2, boolean z3) {
        String string;
        AbstractC167007dF.A1J(str2, 4, enumC33416Epn);
        if (enumC33416Epn != EnumC33416Epn.A0C && enumC33416Epn != EnumC33416Epn.A07) {
            Resources resources = activity.getResources();
            int i = 2131972228;
            if (z2) {
                i = 2131952382;
            }
            string = AbstractC166997dE.A0r(resources, str, i);
        } else {
            Resources resources2 = activity.getResources();
            int i2 = 2131970062;
            if (z2) {
                i2 = 2131970004;
            }
            string = resources2.getString(i2);
        }
        C146106i8 A0X = AbstractC31173DnH.A0X(string);
        if (imageUrl != null) {
            A0X.A09 = imageUrl;
            A0X.A03();
        }
        if (z) {
            A0X.A0L = true;
            A0X.A0A(interfaceC58152PqH);
            A0X.A0G = str2;
        }
        if (z3) {
            A0X.A06();
        }
        AbstractC31178DnM.A1S(A0X);
    }

    public static final boolean A05(C38321qM c38321qM, C38321qM c38321qM2) {
        if (c38321qM2 != null) {
            if (c38321qM.A5M()) {
                c38321qM = c38321qM.A1e(0);
            }
            if (c38321qM2.A5M()) {
                c38321qM2 = c38321qM2.A1e(0);
            }
            C14360o3.A0A(c38321qM);
            String id = c38321qM.getId();
            C14360o3.A0A(c38321qM2);
            if (!C14360o3.A0K(id, c38321qM2.getId())) {
                String id2 = c38321qM.getId();
                if (id2 != null) {
                    String A02 = C3YV.A02(id2);
                    String id3 = c38321qM2.getId();
                    if (id3 != null) {
                        if (!C14360o3.A0K(A02, C3YV.A02(id3))) {
                            return false;
                        }
                    } else {
                        throw AbstractC166987dD.A14("Required value was null.");
                    }
                } else {
                    throw AbstractC166987dD.A14("Required value was null.");
                }
            }
            return true;
        }
        return false;
    }

    public static final void A01(Activity activity, String str, boolean z) {
        String str2;
        String A0r = AbstractC166997dE.A0r(activity.getResources(), str, z ? 2131952377 : 2131972227);
        if (z) {
            str2 = "add_to_collection_failure_notification";
        } else {
            str2 = "remove_from_collection_failure_notification";
        }
        C9GR.A03(activity, A0r, str2, 1);
    }

    public static final void A02(Context context, C38321qM c38321qM, InterfaceC58152PqH interfaceC58152PqH, int i) {
        AbstractC167017dG.A1O(context, c38321qM);
        C146106i8 A0K = AbstractC31171DnF.A0K();
        AbstractC31181DnP.A0P(context.getResources(), c38321qM, A0K, R.plurals.save_home_bulk_edit_add_failure_notification, i);
        A0K.A0A = interfaceC58152PqH;
        A0K.A0G = AbstractC166997dE.A0q(context.getResources(), 2131972568);
        AbstractC31178DnM.A1S(A0K);
    }

    public static final void A03(Context context, C38321qM c38321qM, InterfaceC58152PqH interfaceC58152PqH, int i) {
        AbstractC167017dG.A1O(context, c38321qM);
        C146106i8 A0K = AbstractC31171DnF.A0K();
        AbstractC31181DnP.A0P(context.getResources(), c38321qM, A0K, R.plurals.save_home_bulk_edit_move_failure_notification, i);
        A0K.A0A = interfaceC58152PqH;
        A0K.A0G = AbstractC166997dE.A0q(context.getResources(), 2131972568);
        AbstractC31178DnM.A1S(A0K);
    }

    public static final void A04(Context context, C38321qM c38321qM, SavedCollection savedCollection, int i) {
        AbstractC167027dH.A12(context, savedCollection, c38321qM);
        C146106i8 A0K = AbstractC31171DnF.A0K();
        A0K.A0D = context.getResources().getQuantityString(R.plurals.save_home_bulk_edit_add_success_notification, i, AbstractC25228BEl.A1Z(savedCollection.A0G, i));
        A0K.A09 = c38321qM.A1S();
        A0K.A03();
        AbstractC31178DnM.A1S(A0K);
    }
}
