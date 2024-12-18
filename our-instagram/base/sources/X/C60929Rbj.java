package X;

import android.content.Context;
import android.content.Intent;
import androidx.fragment.app.FragmentActivity;
import com.instagram.base.activity.IgFragmentActivity;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import java.io.File;
import java.util.Arrays;

/* renamed from: X.Rbj, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C60929Rbj extends AbstractC60592pi {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public C60929Rbj(int i, Object obj, Object obj2, Object obj3) {
        this.A00 = i;
        this.A02 = obj;
        this.A03 = obj2;
        this.A01 = obj3;
    }

    @Override // X.AbstractC60592pi, X.InterfaceC60602pj
    public final void onActivityResult(int i, int i2, Intent intent) {
        C6FQ c6fq;
        InterfaceC103384lE interfaceC103384lE;
        Object[] objArr;
        SML sml;
        File file;
        Integer num;
        switch (this.A00) {
            case 0:
                if (i == 2) {
                    if (i2 == -1) {
                        if (!AbstractC63088ScB.A00) {
                            AbstractC63088ScB.A00 = true;
                            Context context = (Context) this.A02;
                            C6FQ c6fq2 = (C6FQ) this.A03;
                            C6FW c6fw = (C6FW) this.A01;
                            if (intent != null && intent.getData() != null) {
                                try {
                                    C54846OMr c54846OMr = new C54846OMr();
                                    android.net.Uri data = intent.getData();
                                    C14360o3.A0B(data, 1);
                                    c54846OMr.A01(context, data);
                                    android.net.Uri fromFile = android.net.Uri.fromFile(c54846OMr.A00());
                                    if (fromFile != null) {
                                        AbstractC63326Sha.A02(fromFile, c6fq2, c6fw);
                                    }
                                } catch (RuntimeException e) {
                                    e.printStackTrace();
                                }
                            }
                        }
                    } else if (i2 == 0) {
                        AbstractC63326Sha.A03((C6FQ) this.A03, (C6FW) this.A01);
                    }
                }
                c6fq = (C6FQ) this.A03;
                break;
            case 1:
                if (i != 1) {
                    return;
                }
                if (i2 == -1 && intent != null && "success".equals(intent.getStringExtra(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATUS))) {
                    String stringExtra = intent.getStringExtra(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_CODE);
                    String stringExtra2 = intent.getStringExtra(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATE);
                    c6fq = (C6FQ) this.A01;
                    interfaceC103384lE = (InterfaceC103384lE) this.A03;
                    objArr = new Object[]{stringExtra, stringExtra2};
                } else {
                    c6fq = (C6FQ) this.A01;
                    interfaceC103384lE = (InterfaceC103384lE) this.A02;
                    objArr = new Object[0];
                }
                C6BQ.A0E(c6fq, interfaceC103384lE, objArr);
                break;
            case 2:
                C6BQ.A0L((C6FQ) this.A01, this);
                if (i == 1) {
                    if (i2 != -1) {
                        if (i2 == 0) {
                            sml = (SML) this.A02;
                            file = (File) this.A03;
                            num = C05F.A0C;
                            sml.A00(num);
                            file.delete();
                            return;
                        }
                    } else {
                        SML sml2 = (SML) this.A02;
                        android.net.Uri fromFile2 = android.net.Uri.fromFile((File) this.A03);
                        InterfaceC103384lE interfaceC103384lE2 = sml2.A03;
                        if (interfaceC103384lE2 == null) {
                            return;
                        }
                        C6FG c6fg = sml2.A00;
                        C6BS c6bs = C6BS.A02;
                        C131845xK.A00(sml2.A01, new C6FW(Arrays.asList(c6fg, C6BX.A00(fromFile2).toString())), interfaceC103384lE2);
                        return;
                    }
                }
                sml = (SML) this.A02;
                file = (File) this.A03;
                num = C05F.A0N;
                sml.A00(num);
                file.delete();
                return;
            case 3:
            case 4:
            default:
                super.onActivityResult(i, i2, intent);
                return;
            case 5:
                if (i != 2884) {
                    return;
                }
                FT1.A01(intent, (C6FQ) this.A03, (InterfaceC103384lE) this.A02, i2);
                ((IgFragmentActivity) ((FragmentActivity) this.A01)).unregisterOnActivityResultListener(this);
                return;
        }
        C6BQ.A0L(c6fq, this);
    }

    @Override // X.AbstractC60592pi, X.InterfaceC60602pj
    public final void onDestroy() {
        Object obj;
        switch (this.A00) {
            case 5:
                ((IgFragmentActivity) ((FragmentActivity) this.A01)).unregisterOnActivityResultListener(this);
                return;
            case 6:
                ((C103464lM) this.A03).A01 = null;
                obj = this.A02;
                break;
            case 7:
                ((C114665Fw) this.A02).A00 = null;
                obj = this.A03;
                break;
            default:
                super.onDestroy();
                return;
        }
        ((C62862tP) obj).A06(this);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // X.AbstractC60592pi, X.InterfaceC60602pj
    public final void onDestroyView() {
        Object obj;
        Object obj2;
        switch (this.A00) {
            case 0:
                obj2 = this.A03;
                C6BQ.A0L((C6FQ) obj2, this);
                return;
            case 1:
            case 5:
            default:
                super.onDestroyView();
                return;
            case 2:
                obj2 = this.A01;
                C6BQ.A0L((C6FQ) obj2, this);
                return;
            case 3:
                obj = ((C15370ps) this.A02).A00;
                ((C2d5) obj).By1().A09((C31349DqE) this.A01);
                ((C62862tP) this.A03).A06(this);
                return;
            case 4:
                obj = this.A02;
                ((C2d5) obj).By1().A09((C31349DqE) this.A01);
                ((C62862tP) this.A03).A06(this);
                return;
            case 6:
            case 7:
                ((C6T7) this.A01).A04();
                return;
        }
    }
}
