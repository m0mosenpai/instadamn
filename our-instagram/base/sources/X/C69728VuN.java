package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.pando.TreeUpdaterJNI;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.debug.devoptions.sandboxselector.DevServerEntity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.VuN, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public class C69728VuN {
    public InterfaceC109864xE A00;
    public InterfaceC109884xG A01;
    public C914346k A02;
    public C914346k A03;
    public C914346k A04;
    public Integer A05;
    public Integer A06;
    public Integer A07;
    public String A08;
    public String A09;
    public String A0A;
    public String A0B;
    public String A0C;
    public List A0D;
    public final InterfaceC109094vY A0E;

    public final C109084vX A00() {
        C109854xD c109854xD;
        ArrayList arrayList;
        InterfaceC109864xE interfaceC109864xE = this.A00;
        C109874xF c109874xF = null;
        if (interfaceC109864xE != null) {
            c109854xD = interfaceC109864xE.ErT();
        } else {
            c109854xD = null;
        }
        C914346k c914346k = this.A02;
        C914346k c914346k2 = this.A03;
        List list = this.A0D;
        if (list != null) {
            arrayList = AbstractC167017dG.A0q(list);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((InterfaceC109864xE) it.next()).ErT());
            }
        } else {
            arrayList = null;
        }
        String str = this.A08;
        InterfaceC109884xG interfaceC109884xG = this.A01;
        if (interfaceC109884xG != null) {
            c109874xF = interfaceC109884xG.Evd();
        }
        return new C109084vX(c109854xD, c109874xF, c914346k, c914346k2, this.A04, this.A05, this.A06, this.A07, str, this.A09, this.A0A, this.A0B, this.A0C, arrayList);
    }

    public final InterfaceC109094vY A01() {
        Object A00;
        TreeUpdaterJNI treeUpdaterJNI;
        TreeUpdaterJNI treeUpdaterJNI2;
        TreeUpdaterJNI treeUpdaterJNI3;
        ArrayList arrayList;
        TreeUpdaterJNI treeUpdaterJNI4;
        InterfaceC109094vY interfaceC109094vY = this.A0E;
        if (interfaceC109094vY instanceof C68055V8h) {
            InterfaceC109864xE interfaceC109864xE = this.A00;
            TreeUpdaterJNI treeUpdaterJNI5 = null;
            if (interfaceC109864xE != null) {
                treeUpdaterJNI = interfaceC109864xE.F7o();
            } else {
                treeUpdaterJNI = null;
            }
            C09530e4 c09530e4 = new C09530e4("banner", treeUpdaterJNI);
            C914346k c914346k = this.A02;
            if (c914346k != null) {
                treeUpdaterJNI2 = c914346k.A00();
            } else {
                treeUpdaterJNI2 = null;
            }
            C09530e4 c09530e42 = new C09530e4("banner_bloks_data", treeUpdaterJNI2);
            C914346k c914346k2 = this.A03;
            if (c914346k2 != null) {
                treeUpdaterJNI3 = c914346k2.A00();
            } else {
                treeUpdaterJNI3 = null;
            }
            C09530e4 c09530e43 = new C09530e4("bloks_data", treeUpdaterJNI3);
            List<InterfaceC109864xE> list = this.A0D;
            if (list != null) {
                arrayList = new ArrayList();
                for (InterfaceC109864xE interfaceC109864xE2 : list) {
                    if (interfaceC109864xE2 != null) {
                        arrayList.add(interfaceC109864xE2.F7o());
                    }
                }
            } else {
                arrayList = null;
            }
            C09530e4 c09530e44 = new C09530e4("buttons", arrayList);
            C09530e4 c09530e45 = new C09530e4(DevServerEntity.COLUMN_DESCRIPTION, this.A08);
            InterfaceC109884xG interfaceC109884xG = this.A01;
            if (interfaceC109884xG != null) {
                treeUpdaterJNI4 = interfaceC109884xG.F7o();
            } else {
                treeUpdaterJNI4 = null;
            }
            C09530e4 c09530e46 = new C09530e4(PublicKeyCredentialControllerUtility.JSON_KEY_ICON, treeUpdaterJNI4);
            C09530e4 c09530e47 = new C09530e4("misinformation_type", this.A05);
            C09530e4 c09530e48 = new C09530e4("overlay_applied_timestamp", this.A06);
            C914346k c914346k3 = this.A04;
            if (c914346k3 != null) {
                treeUpdaterJNI5 = c914346k3.A00();
            }
            A00 = AbstractC37303Gc4.A06(interfaceC109094vY, new C09530e4[]{c09530e4, c09530e42, c09530e43, c09530e44, c09530e45, c09530e46, c09530e47, c09530e48, new C09530e4("overlay_bloks_data", treeUpdaterJNI5), new C09530e4("overlay_layout", this.A07), new C09530e4("overlay_type", this.A09), new C09530e4(AbstractC37310GcC.A01(0, 10, 123), this.A0A), new C09530e4("sub_category", this.A0B), new C09530e4(DialogModule.KEY_TITLE, this.A0C)});
        } else {
            A00 = A00();
        }
        return (InterfaceC109094vY) A00;
    }

    public C69728VuN(InterfaceC109094vY interfaceC109094vY) {
        this.A0E = interfaceC109094vY;
        this.A00 = interfaceC109094vY.AfL();
        this.A02 = interfaceC109094vY.AfM();
        this.A03 = interfaceC109094vY.AgU();
        this.A0D = interfaceC109094vY.AjH();
        this.A08 = interfaceC109094vY.getDescription();
        this.A01 = interfaceC109094vY.BEg();
        this.A05 = interfaceC109094vY.BUD();
        this.A06 = interfaceC109094vY.BaV();
        this.A04 = interfaceC109094vY.BaW();
        this.A07 = interfaceC109094vY.BaY();
        this.A09 = interfaceC109094vY.getOverlayType();
        this.A0A = interfaceC109094vY.getSessionId();
        this.A0B = interfaceC109094vY.getSubCategory();
        this.A0C = interfaceC109094vY.getTitle();
    }
}
