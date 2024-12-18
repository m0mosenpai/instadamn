package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.textcell.IgdsListCell;

/* renamed from: X.ERi, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32456ERi extends AbstractC65632xz {
    public FP8 A00;
    public Context A01;
    public UserSession A02;
    public final View.OnClickListener A03 = ViewOnClickListenerC35681FpG.A00(this, 57);

    @Override // X.InterfaceC65642y0
    public final /* bridge */ /* synthetic */ void buildRowViewTypes(AnonymousClass306 anonymousClass306, Object obj, Object obj2) {
        anonymousClass306.A7a(0);
    }

    @Override // X.InterfaceC65642y0
    public final int getViewTypeCount() {
        return 1;
    }

    public C32456ERi(Context context, UserSession userSession, FP8 fp8) {
        this.A01 = context;
        this.A00 = fp8;
        this.A02 = userSession;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0045, code lost:
    
        if (r12.A01 == false) goto L9;
     */
    @Override // X.InterfaceC65642y0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void bindView(int r9, android.view.View r10, java.lang.Object r11, java.lang.Object r12) {
        /*
            r8 = this;
            r0 = 1344054315(0x501ca42b, float:1.0512018E10)
            int r5 = X.C0f9.A03(r0)
            com.instagram.igds.components.textcell.IgdsListCell r10 = (com.instagram.igds.components.textcell.IgdsListCell) r10
            X.FR9 r11 = (X.FR9) r11
            X.Ete r12 = (X.C33628Ete) r12
            X.FP8 r1 = r8.A00
            android.view.View$OnClickListener r6 = r8.A03
            com.instagram.common.session.UserSession r0 = r8.A02
            boolean r0 = X.F28.A00(r0)
            r7 = r0 ^ 1
            X.AbstractC167017dG.A1N(r10, r11)
            r3 = 2
            X.AbstractC25233BEq.A0w(r3, r12, r1, r6)
            r0 = 16
            X.FpJ r4 = new X.FpJ
            r4.<init>(r0, r10, r11, r1)
            r0 = 7
            X.FqD r2 = new X.FqD
            r2.<init>(r0, r11, r1)
            boolean r1 = r12.A00
            r0 = 1050253722(0x3e99999a, float:0.3)
            if (r1 == 0) goto L36
            r0 = 1065353216(0x3f800000, float:1.0)
        L36:
            r10.setAlpha(r0)
            boolean r0 = r12.A00
            r10.setButtonUIEnabled(r0)
            boolean r0 = r12.A00
            if (r0 == 0) goto L47
            boolean r1 = r12.A01
            r0 = 1
            if (r1 != 0) goto L48
        L47:
            r0 = 0
        L48:
            r10.setChecked(r0)
            boolean r0 = r12.A00
            if (r0 == 0) goto L50
            r6 = r4
        L50:
            X.C0fQ.A00(r6, r10)
            r10.A0D(r2)
            java.lang.String r0 = r11.A02
            X.C14360o3.A07(r0)
            r10.A0I(r0)
            java.lang.String r1 = r11.A03
            if (r7 == 0) goto L70
            if (r1 == 0) goto L70
            int r0 = r1.length()
            if (r0 == 0) goto L70
            r10.A0H(r1)
            r10.setSubtitleMaxLine(r3)
        L70:
            r0 = 1050739948(0x3ea104ec, float:0.31449068)
            X.C0f9.A0A(r0, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C32456ERi.bindView(int, android.view.View, java.lang.Object, java.lang.Object):void");
    }

    @Override // X.InterfaceC65642y0
    public final View createView(int i, ViewGroup viewGroup) {
        int A03 = C0f9.A03(-2138843430);
        Context context = this.A01;
        C14360o3.A0B(context, 0);
        IgdsListCell A0Z = AbstractC31174DnI.A0Z(context);
        A0Z.setTextCellType(EnumC53237Nga.A03);
        C0f9.A0A(1787506222, A03);
        return A0Z;
    }
}
