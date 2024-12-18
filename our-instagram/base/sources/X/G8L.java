package X;

import android.content.Context;
import android.content.res.Resources;
import java.util.regex.Pattern;

/* loaded from: classes6.dex */
public final class G8L implements InterfaceC57949Pmv {
    public static final Pattern A02;
    public boolean A00;
    public final Context A01;

    static {
        Pattern compile = Pattern.compile("(?:[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*|\"(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21\\x23-\\x5b\\x5d-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])*\")@(?:(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?|\\[(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?|[a-z0-9-]*[a-z0-9]:(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21-\\x5a\\x53-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])+)\\])");
        C14360o3.A07(compile);
        A02 = compile;
    }

    public G8L(Context context) {
        this.A01 = context;
    }

    @Override // X.InterfaceC57949Pmv
    public final C54543O7v getState(C54543O7v c54543O7v, CharSequence charSequence, boolean z) {
        Resources resources;
        int i;
        AbstractC167017dG.A1N(c54543O7v, charSequence);
        if (charSequence.length() != 0 && !F88.A00(charSequence.toString())) {
            c54543O7v.A01 = "error";
            resources = this.A01.getResources();
            i = 2131964633;
        } else {
            if (this.A00 && charSequence.length() == 0) {
                c54543O7v.A01 = "error";
                resources = this.A01.getResources();
                i = 2131972450;
            }
            return c54543O7v;
        }
        c54543O7v.A00 = resources.getString(i);
        return c54543O7v;
    }

    public G8L(Context context, boolean z) {
        this.A01 = context;
        this.A00 = true;
    }
}
