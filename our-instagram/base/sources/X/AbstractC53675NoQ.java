package X;

import android.content.Context;
import com.facebook.commonavatarliveediting.api.CdlProviderHolderRegistry;
import com.facebook.commonavatarliveediting.prefetch.CommonCdlProviderHolder;
import com.facebook.fbavatar.cdsavatareditor.liveediting.ig.IgCdlProviderBuilder;

/* renamed from: X.NoQ, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC53675NoQ {
    public static final CommonCdlProviderHolder A00(Context context, IgCdlProviderBuilder igCdlProviderBuilder) {
        CdlProviderHolderRegistry cdlProviderHolderRegistry;
        AbstractC167017dG.A1N(igCdlProviderBuilder, context);
        CommonCdlProviderHolder commonCdlProviderHolder = CommonCdlProviderHolder.A07;
        if (commonCdlProviderHolder == null) {
            commonCdlProviderHolder = new CommonCdlProviderHolder(context, igCdlProviderBuilder);
            CommonCdlProviderHolder.A07 = commonCdlProviderHolder;
            C53673NoO c53673NoO = CdlProviderHolderRegistry.A04;
            IgCdlProviderBuilder igCdlProviderBuilder2 = commonCdlProviderHolder.A03;
            synchronized (c53673NoO) {
                cdlProviderHolderRegistry = CdlProviderHolderRegistry.A03;
                if (cdlProviderHolderRegistry == null) {
                    cdlProviderHolderRegistry = new CdlProviderHolderRegistry(igCdlProviderBuilder2);
                    CdlProviderHolderRegistry.A03 = cdlProviderHolderRegistry;
                }
            }
            commonCdlProviderHolder.A00 = cdlProviderHolderRegistry;
        }
        return commonCdlProviderHolder;
    }
}
