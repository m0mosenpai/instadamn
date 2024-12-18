package X;

import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import com.facebook.react.uimanager.UIManagerHelper;
import com.instagram.common.session.UserSession;

/* renamed from: X.SkA, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class DialogInterfaceOnShowListenerC63431SkA implements DialogInterface.OnShowListener {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public DialogInterfaceOnShowListenerC63431SkA(int i, Object obj, Object obj2, Object obj3) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj;
        this.A03 = obj3;
    }

    @Override // android.content.DialogInterface.OnShowListener
    public final void onShow(DialogInterface dialogInterface) {
        C18920wW c18920wW;
        String str;
        String id;
        switch (this.A00) {
            case 0:
                ((X9J) this.A01).APn(new Sb5(UIManagerHelper.A00((Context) this.A02), ((View) this.A03).getId()));
                return;
            case 1:
                c18920wW = (C18920wW) this.A02;
                str = ((UserSession) this.A03).userId;
                id = ((C38321qM) this.A01).getId();
                if (id == null) {
                    throw AbstractC166997dE.A0g();
                }
                break;
            default:
                c18920wW = (C18920wW) this.A02;
                str = ((UserSession) this.A03).userId;
                id = ((C38321qM) this.A01).getId();
                if (id == null) {
                    throw AbstractC166997dE.A0g();
                }
                break;
        }
        AbstractC167017dG.A1N(c18920wW, str);
        C41684IdD.A00(c18920wW, str, id, "dialog_impression");
    }
}
