package X;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.R;
import com.facebook.login.LoginClient$Request;
import java.math.BigInteger;
import java.util.Random;

/* loaded from: classes10.dex */
public final class Q7e extends AbstractC59972of {
    public LoginClient$Request A00;
    public String A01;
    public C63209SfE A02;
    public String A03;
    public String A04;

    @Override // androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.putParcelable("Request", this.A02.A01);
        bundle.putInt("HandlerIndex", this.A02.A00);
        bundle.putString(PublicKeyCredentialControllerUtility.JSON_KEY_CHALLENGE, this.A04);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        InterfaceC65487Tl7 interfaceC65487Tl7;
        super.onActivityResult(i, i2, intent);
        C63209SfE c63209SfE = this.A02;
        int i3 = c63209SfE.A00;
        InterfaceC65487Tl7[] interfaceC65487Tl7Arr = c63209SfE.A04;
        if (i3 < interfaceC65487Tl7Arr.length && (interfaceC65487Tl7 = interfaceC65487Tl7Arr[i3]) != null) {
            interfaceC65487Tl7.Cv2(intent, i, i2);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        String bigInteger;
        int A02 = C0f9.A02(1782361083);
        super.onCreate(bundle);
        this.A03 = requireActivity().getCallingPackage();
        LoginClient$Request loginClient$Request = (LoginClient$Request) AbstractC31173DnH.A0A(requireActivity()).getParcelable("Request");
        this.A00 = loginClient$Request;
        int i = -1;
        if (bundle != null) {
            i = bundle.getInt("HandlerIndex", -1);
            loginClient$Request = (LoginClient$Request) bundle.getParcelable("Request");
            bigInteger = bundle.getString(PublicKeyCredentialControllerUtility.JSON_KEY_CHALLENGE);
        } else {
            bigInteger = new BigInteger(100, new Random()).toString(32);
        }
        this.A04 = bigInteger;
        this.A02 = new C63209SfE(this, loginClient$Request, bigInteger, i);
        this.A01 = loginClient$Request.A05;
        C0f9.A09(147861859, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-1612693680);
        View A0A = AbstractC31172DnG.A0A(layoutInflater, viewGroup, R.layout.com_facebook_login_fragment);
        C0f9.A09(317660332, A02);
        return A0A;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        int A02 = C0f9.A02(583866848);
        super.onPause();
        requireActivity().findViewById(R.id.com_facebook_login_activity_progress_bar).setVisibility(8);
        C0f9.A09(1736606090, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        int i;
        int A02 = C0f9.A02(832481579);
        super.onResume();
        if (this.A03 == null) {
            android.util.Log.e("LoginFragment", "Cannot call LoginActivity with a null calling package. This can occur if the launchMode of the caller is singleInstance.");
            AbstractC25227BEk.A1B(this);
            i = -1425557433;
        } else {
            C63209SfE c63209SfE = this.A02;
            if (c63209SfE.A00 == -1) {
                c63209SfE.A02();
            }
            i = -1297547174;
        }
        C0f9.A09(i, A02);
    }
}
