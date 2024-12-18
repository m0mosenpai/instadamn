package X;

import android.content.Context;
import android.graphics.Color;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BulletSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.QuoteSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.SubscriptSpan;
import android.text.style.SuperscriptSpan;
import android.text.style.UnderlineSpan;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.api.schemas.ColorAtTextRangeDictIntf;
import com.instagram.api.schemas.InlineStyleAtRangeDictIntf;
import com.instagram.api.schemas.TextWithEntitiesBlockDictIntf;
import com.instagram.common.textwithentities.model.TextWithEntitiesIntf;
import com.instagram.common.ui.text.CustomTypefaceSpan;
import com.instagram.react.modules.base.IgReactQEModule;
import java.util.List;

/* loaded from: classes7.dex */
public abstract class IQ4 {
    /* JADX WARN: Failed to find 'out' block for switch in B:11:0x0068. Please report as an issue. */
    public static SpannableString A00(Context context, TextWithEntitiesIntf textWithEntitiesIntf) {
        String BDa;
        int i;
        Object styleSpan;
        SpannableString spannableString = new SpannableString(textWithEntitiesIntf.getText());
        List<InlineStyleAtRangeDictIntf> BHs = textWithEntitiesIntf.BHs();
        if (BHs == null) {
            BHs = C16930sl.A00;
        }
        for (InlineStyleAtRangeDictIntf inlineStyleAtRangeDictIntf : BHs) {
            C14360o3.A0B(inlineStyleAtRangeDictIntf, 0);
            int min = Math.min(AbstractC167017dG.A0K(inlineStyleAtRangeDictIntf.BYa()), spannableString.length());
            int min2 = Math.min(AbstractC167017dG.A0K(inlineStyleAtRangeDictIntf.BYa()) + AbstractC167017dG.A0K(inlineStyleAtRangeDictIntf.BN2()), spannableString.length());
            EnumC72376XcC enumC72376XcC = (EnumC72376XcC) EnumC72376XcC.A01.get(inlineStyleAtRangeDictIntf.BHr().intValue());
            if (enumC72376XcC == null) {
                enumC72376XcC = EnumC72376XcC.A07;
            }
            switch (enumC72376XcC.ordinal()) {
                case 1:
                    i = 1;
                    styleSpan = new StyleSpan(i);
                    spannableString.setSpan(styleSpan, min, min2, 17);
                    break;
                case 2:
                    i = 2;
                    styleSpan = new StyleSpan(i);
                    spannableString.setSpan(styleSpan, min, min2, 17);
                    break;
                case 3:
                    styleSpan = new UnderlineSpan();
                    spannableString.setSpan(styleSpan, min, min2, 17);
                    break;
                case 5:
                    styleSpan = new StrikethroughSpan();
                    spannableString.setSpan(styleSpan, min, min2, 17);
                    break;
                case 6:
                    styleSpan = new SubscriptSpan();
                    spannableString.setSpan(styleSpan, min, min2, 17);
                    break;
                case 7:
                    styleSpan = new SuperscriptSpan();
                    spannableString.setSpan(styleSpan, min, min2, 17);
                    break;
                case 9:
                    spannableString.setSpan(new CustomTypefaceSpan(AbstractC15960qq.A00(context).A02(EnumC15950qp.A13)), min, min2, 17);
                    break;
            }
        }
        List<ColorAtTextRangeDictIntf> ApN = textWithEntitiesIntf.ApN();
        if (ApN == null) {
            ApN = C16930sl.A00;
        }
        for (ColorAtTextRangeDictIntf colorAtTextRangeDictIntf : ApN) {
            C14360o3.A0B(colorAtTextRangeDictIntf, 0);
            int min3 = Math.min(AbstractC167017dG.A0K(colorAtTextRangeDictIntf.BYa()), spannableString.length());
            int min4 = Math.min(AbstractC167017dG.A0K(colorAtTextRangeDictIntf.BYa()) + AbstractC167017dG.A0K(colorAtTextRangeDictIntf.BYa()), spannableString.length());
            if (AbstractC72723Nt.A00(context)) {
                BDa = colorAtTextRangeDictIntf.BDb();
            } else {
                BDa = colorAtTextRangeDictIntf.BDa();
            }
            spannableString.setSpan(new ForegroundColorSpan(Color.parseColor(BDa)), min3, min4, 17);
        }
        return spannableString;
    }

    public static SpannableStringBuilder A01(Context context, TextWithEntitiesBlockDictIntf textWithEntitiesBlockDictIntf) {
        Object bulletSpan;
        SpannableStringBuilder A01 = AbstractC37300Gc1.A01();
        TextWithEntitiesIntf C6r = textWithEntitiesBlockDictIntf.C6r();
        C6r.getClass();
        A01.append((CharSequence) A00(context, C6r));
        String blockType = textWithEntitiesBlockDictIntf.getBlockType();
        C14360o3.A0B(blockType, 0);
        VG0 vg0 = (VG0) VG0.A01.get(blockType);
        if (vg0 == null) {
            vg0 = VG0.A0F;
        }
        int ordinal = vg0.ordinal();
        if (ordinal == 2 || ordinal == 3) {
            bulletSpan = new BulletSpan(14);
        } else {
            switch (ordinal) {
                case 4:
                case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                    bulletSpan = new QuoteSpan();
                    break;
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                    A01.setSpan(new AbsoluteSizeSpan(16, true), 0, A01.length(), 17);
                    A01.setSpan(new StyleSpan(1), 0, A01.length(), 17);
                    bulletSpan = new C41859Igx(47.5f);
                    break;
                case 11:
                case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                case 14:
                case Process.SIGTERM /* 15 */:
                case 16:
                case 17:
                default:
                    return A01;
                case 18:
                    bulletSpan = new AbsoluteSizeSpan(12, true);
                    break;
            }
        }
        A01.setSpan(bulletSpan, 0, A01.length(), 17);
        return A01;
    }
}
