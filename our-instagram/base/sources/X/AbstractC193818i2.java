package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.ui.widget.mediapicker.Folder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.8i2, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC193818i2 implements InterfaceC193828i3 {
    public C8QJ A00;
    public final Context A01;
    public final EnumC60792q3 A02;
    public final UserSession A03;
    public final InterfaceC09390do A04 = AbstractC09440dt.A00(EnumC09460dv.A02, new C9E0(this, 30));
    public final boolean A05;
    public final boolean A06;

    /* JADX WARN: Type inference failed for: r8v9, types: [X.2pI, java.lang.Object] */
    public final void A00(View view, InterfaceC195648l5 interfaceC195648l5, boolean z) {
        Drawable drawable;
        Drawable drawable2;
        Object obj;
        C14360o3.A0B(interfaceC195648l5, 0);
        C14360o3.A0B(view, 1);
        C8QJ c8qj = this.A00;
        if (c8qj != null && c8qj.isShowing()) {
            return;
        }
        Context context = this.A01;
        UserSession userSession = this.A03;
        this.A00 = new C8QJ(context, userSession, null, this.A06);
        ArrayList arrayList = new ArrayList();
        String string = context.getString(2131952890);
        C14360o3.A07(string);
        KNL knl = new KNL(string);
        String string2 = context.getString(2131952887);
        C14360o3.A07(string2);
        KNJ knj = new KNJ(string2);
        String string3 = context.getString(2131952889);
        C14360o3.A07(string3);
        ArrayList A1N = AbstractC16960so.A1N(knl, knj, new KNK(string3));
        if (!this.A05) {
            String string4 = context.getString(2131952891);
            C14360o3.A07(string4);
            A1N.add(new KNM(string4));
        }
        List folders = interfaceC195648l5.getFolders();
        Folder currentFolder = interfaceC195648l5.getCurrentFolder();
        ArrayList<C09530e4> arrayList2 = new ArrayList();
        Iterator it = A1N.iterator();
        while (it.hasNext()) {
            L8Z l8z = (L8Z) it.next();
            Iterator it2 = folders.iterator();
            while (true) {
                if (it2.hasNext()) {
                    obj = it2.next();
                    if (((Folder) obj).A02 == l8z.A00()) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            Folder folder = (Folder) obj;
            if (folder != null && !folder.A05.isEmpty()) {
                arrayList2.add(new C09530e4(l8z, folder));
            }
        }
        for (C09530e4 c09530e4 : arrayList2) {
            L8Z l8z2 = (L8Z) c09530e4.A00;
            Folder folder2 = (Folder) c09530e4.A01;
            String A01 = l8z2.A01();
            if (C14360o3.A0K(folder2, currentFolder)) {
                drawable = context.getDrawable(R.drawable.instagram_check_pano_filled_24);
            } else {
                drawable = null;
            }
            Integer num = l8z2.A00;
            if (num != null) {
                drawable2 = context.getDrawable(num.intValue());
            } else {
                drawable2 = null;
            }
            arrayList.add(new C199928sw(drawable, drawable2, null, new C23947Ajh(this, folder2), null, A01, 0, context.getResources().getDimensionPixelSize(R.dimen.ab_test_media_thumbnail_preview_item_internal_padding), context.getResources().getDimensionPixelSize(R.dimen.abc_select_dialog_padding_start_material), true, false, false, true, false, false, false));
        }
        String string5 = context.getResources().getString(2131964739);
        C14360o3.A07(string5);
        arrayList.add(new C199928sw(null, context.getDrawable(R.drawable.instagram_collections_pano_outline_24), null, new C23934AjU(this), null, string5, 0, 0, context.getResources().getDimensionPixelSize(R.dimen.abc_select_dialog_padding_start_material), true, false, false, true, false, false, false));
        List folders2 = interfaceC195648l5.getFolders();
        if (!(folders2 instanceof Collection) || !folders2.isEmpty()) {
            Iterator it3 = folders2.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    break;
                }
                if (((Folder) it3.next()).A07) {
                    if (new Object().A01(userSession, true)) {
                        String string6 = context.getResources().getString(2131964746);
                        C14360o3.A07(string6);
                        arrayList.add(new C199928sw(null, context.getDrawable(R.drawable.instagram_lux_pano_outline_24), null, new C23935AjV(this), null, string6, 0, 0, context.getResources().getDimensionPixelSize(R.dimen.abc_select_dialog_padding_start_material), true, false, false, true, false, false, false));
                    }
                }
            }
        }
        C8QJ c8qj2 = this.A00;
        if (z) {
            if (c8qj2 == null) {
                return;
            }
            int i = -view.getHeight();
            c8qj2.A02(arrayList);
            c8qj2.showAsDropDown(view, 0, i, 8388613);
            return;
        }
        if (c8qj2 == null) {
            return;
        }
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.account_discovery_bottom_gap);
        int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(R.dimen.account_discovery_bottom_gap);
        c8qj2.A02(arrayList);
        c8qj2.showAsDropDown(view, dimensionPixelSize, dimensionPixelSize2, 0);
    }

    @Override // X.InterfaceC193828i3
    public final /* synthetic */ void CiM(L8Z l8z, int i) {
    }

    @Override // X.InterfaceC193828i3
    public final /* synthetic */ void CiN(C51756Mtf c51756Mtf, int i) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000b, code lost:
    
        if (r1 != null) goto L6;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    @Override // X.InterfaceC193828i3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void CwI(X.C51756Mtf r4, int r5) {
        /*
            r3 = this;
            r2 = r3
            boolean r0 = r3 instanceof X.C193808i1
            if (r0 == 0) goto L25
            X.8i1 r2 = (X.C193808i1) r2
            X.8YY r0 = r2.A00
            X.8i4 r1 = r0.A02
        Lb:
            if (r1 == 0) goto L14
        Ld:
            java.lang.Object r0 = r4.A00
            X.8Z4 r0 = (X.C8Z4) r0
            r1.DTe(r0)
        L14:
            X.0do r0 = r3.A04
            java.lang.Object r0 = r0.getValue()
            X.L9r r0 = (X.C47809L9r) r0
            X.8aR r1 = r0.A02
            if (r1 == 0) goto L24
            r0 = 0
            r1.A0L(r0)
        L24:
            return
        L25:
            X.9KS r2 = (X.C9KS) r2
            X.8ak r1 = r2.A00
            if (r1 != 0) goto Ld
            X.2oe r0 = r2.A01
            X.0h2 r1 = r0.getChildFragmentManager()
            r0 = 2131432793(0x7f0b1559, float:1.8487353E38)
            androidx.fragment.app.Fragment r1 = r1.A0O(r0)
            boolean r0 = r1 instanceof X.InterfaceC189658ak
            if (r0 == 0) goto L14
            X.8ak r1 = (X.InterfaceC189658ak) r1
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC193818i2.CwI(X.Mtf, int):void");
    }

    @Override // X.InterfaceC193828i3
    public final /* synthetic */ void CwM() {
    }

    @Override // X.InterfaceC193828i3
    public final /* synthetic */ void Djk(int i, String str) {
    }

    public AbstractC193818i2(Context context, EnumC60792q3 enumC60792q3, UserSession userSession, boolean z, boolean z2) {
        this.A01 = context;
        this.A03 = userSession;
        this.A02 = enumC60792q3;
        this.A06 = z;
        this.A05 = z2;
    }

    @Override // X.InterfaceC193828i3
    public final /* synthetic */ boolean DRf(L8Z l8z, int i) {
        return false;
    }
}
