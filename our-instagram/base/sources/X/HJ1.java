package X;

import android.app.Activity;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.login.smartlock.impl.SmartLockPluginImpl;
import com.instagram.modal.TransparentModalActivity;
import com.instagram.reels.question.model.QuestionResponsesModelIntf;
import java.io.File;
import java.io.IOException;

/* loaded from: classes7.dex */
public final class HJ1 extends C2AH {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final boolean A05;

    public HJ1(int i, Object obj, Object obj2, Object obj3, Object obj4, boolean z) {
        this.A00 = i;
        this.A02 = obj2;
        this.A05 = z;
        this.A03 = obj4;
        this.A04 = obj3;
        this.A01 = obj;
    }

    @Override // X.C2AH
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        InterfaceC65576TnA interfaceC65576TnA;
        String str;
        FragmentActivity activity;
        String absolutePath;
        if (this.A00 != 0) {
            File file = (File) obj;
            try {
                absolutePath = file.getCanonicalPath();
            } catch (IOException e) {
                C0w9.A06("ReelQuestionResponseShareHelper_getFilePath", AbstractC111324zv.A00(1606), e);
                absolutePath = file.getAbsolutePath();
            }
            Bundle bundle = (Bundle) this.A02;
            bundle.putString(AbstractC111324zv.A00(2977), absolutePath);
            bundle.putBoolean(AbstractC111324zv.A00(2975), this.A05);
            C41628IbJ c41628IbJ = (C41628IbJ) this.A03;
            bundle.putString(AbstractC111324zv.A00(2979), C41628IbJ.A00(c41628IbJ).getId());
            QuestionResponsesModelIntf questionResponsesModelIntf = c41628IbJ.A01;
            bundle.putString(AbstractC111324zv.A00(2980), questionResponsesModelIntf.getQuestion());
            bundle.putInt(AbstractC111324zv.A00(2981), c41628IbJ.A01());
            bundle.putString(AbstractC111324zv.A00(2976), questionResponsesModelIntf.BjV());
            bundle.putString(AbstractC111324zv.A00(2978), c41628IbJ.A00.getId());
            AbstractC12990ll abstractC12990ll = (AbstractC12990ll) this.A04;
            Activity activity2 = (Activity) this.A01;
            C6XJ.A02(activity2, bundle, abstractC12990ll, TransparentModalActivity.class, AbstractC111324zv.A00(5181)).A0C(activity2);
            return;
        }
        AbstractC27461Uz abstractC27461Uz = (AbstractC27461Uz) obj;
        C14360o3.A0B(abstractC27461Uz, 0);
        if (!((SmartLockPluginImpl) abstractC27461Uz).A00) {
            interfaceC65576TnA = (InterfaceC65576TnA) this.A02;
            str = "SmartLock disabled";
        } else {
            Fragment fragment = (Fragment) this.A03;
            if (fragment != null && (activity = fragment.getActivity()) != null) {
                InterfaceC65576TnA interfaceC65576TnA2 = (InterfaceC65576TnA) this.A02;
                EnumC31713DwI enumC31713DwI = (EnumC31713DwI) this.A01;
                C07270a1 c07270a1 = (C07270a1) this.A04;
                abstractC27461Uz.getSmartLockBroker(activity, new TGY(fragment, c07270a1, interfaceC65576TnA2, enumC31713DwI, this.A05), c07270a1, false);
                return;
            }
            interfaceC65576TnA = (InterfaceC65576TnA) this.A02;
            str = "Activity is null";
        }
        interfaceC65576TnA.CKO(str);
    }
}
