package X;

import android.app.Activity;
import android.graphics.Bitmap;
import android.os.Bundle;
import com.instagram.common.session.UserSession;
import com.instagram.modal.TransparentModalActivity;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.Wha, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70817Wha implements XCU {
    public final /* synthetic */ Bitmap A00;
    public final /* synthetic */ C66089TzQ A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ ArrayList A03;

    public C70817Wha(Bitmap bitmap, C66089TzQ c66089TzQ, String str, ArrayList arrayList) {
        this.A01 = c66089TzQ;
        this.A00 = bitmap;
        this.A03 = arrayList;
        this.A02 = str;
    }

    @Override // X.XCU
    public final void onFailure(Exception exc) {
        C66089TzQ c66089TzQ = this.A01;
        C146106i8 c146106i8 = new C146106i8();
        c146106i8.A0D = c66089TzQ.A01.getString(2131964635);
        c146106i8.A05();
        c146106i8.A0H = "invalid_explore_grid_error";
        AbstractC25233BEq.A1F(c146106i8);
        this.A00.recycle();
    }

    @Override // X.XCU
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        String absolutePath;
        File file = (File) obj;
        C14360o3.A0B(file, 0);
        try {
            absolutePath = file.getCanonicalPath();
        } catch (IOException unused) {
            absolutePath = file.getAbsolutePath();
        }
        Bundle bundle = new Bundle();
        ArrayList<String> arrayList = this.A03;
        String str = this.A02;
        C66089TzQ c66089TzQ = this.A01;
        bundle.putStringArrayList("string_list", arrayList);
        bundle.putString(AbstractC111324zv.A00(350), absolutePath);
        bundle.putString("explore_grid_file", str);
        bundle.putInt("entrypoint", c66089TzQ.A00);
        UserSession userSession = c66089TzQ.A02;
        Activity activity = c66089TzQ.A01;
        C6XJ.A02(activity, bundle, userSession, TransparentModalActivity.class, "explore_grid_share").A0C(activity);
        this.A00.recycle();
    }
}
